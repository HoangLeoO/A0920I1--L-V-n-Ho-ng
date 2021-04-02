package caseStudy.controllers;

import caseStudy.commons.ReadFile;
import caseStudy.exceptions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularException {
    private static final String ID_VILLA_RG = "SVVL-\\d{4}"; //SV(VL|HO||RO)-\d{4}
    private static final String ID_HOUSE_RG = "SVHO-\\d{4}";
    private static final String ID_ROOM_RG = "SVRO-\\d{4}";
    private static final String NAME_RG = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
    private static final String AREA_RG = "^([3][0]\\.\\d+)|([3][1-9]\\.?\\d*)|([4-9]\\d\\.?\\d*)|(\\d{3,}\\.?\\d*)$"; //"^([3][0]\\.\\d+)";
    private static final String COST_RG = "^[1-9]\\d*$";
    private static final String AMOUNT_PEOPLE_RG = "\\b(0?[1-9]|1[0-9])\\b";
    private static final String ACCOMPANIED_SERVICES_RG = "^(massage|karaoke|food|car)$";
    private static final String NUMBER_FLOOR_RG = "^[1-9]\\d*$";
    private static final String DATE_OF_BIRTH_RG = "^([0][1-9]|[12][0-9]|[3][01])/([0][1-9]|[1][012])/([2][0][0]([012])|[1][9]\\d{2})$";
    private static final String GENDER_RG = "^(male|female|unknow)$";
    private static final String ID_CARD_RG = "^\\d{9}$";
    private static final String NUMBER_PHONE_RG = "^\\d{10}$";
    private static final String EMAIL_RG = "^\\w{3,}(\\.?\\w+)*@[a-z]{2,7}(.[a-z]{2,5}){1,3}$";
    private static final String CUSTOMER_TYPE_RG = "^(member|sliver|gold|platinum|diamond|Member|Sliver|Gold|Platinum|Diamond)$";
    private static final String ID_EMPLOYEE = "EP-\\d{4}";

    private static Pattern pattern;
    private static Matcher matcher;

    public static void validateIdVilla(String idVilla) throws IdServicesException {
        pattern = Pattern.compile(ID_VILLA_RG);
        matcher = pattern.matcher(idVilla);
        if(!matcher.matches()){
            throw new IdServicesException("ID Villa has a format SVVL-XXXX (X : 0 - 9)");
        }
    }

    public static void validateIdHouse(String idHouse) throws IdServicesException {
        pattern = Pattern.compile(ID_HOUSE_RG);
        matcher = pattern.matcher(idHouse);
        if(!matcher.matches()){
            throw new IdServicesException("ID House has a format SVHO-XXXX (X : 0 - 9 ) ");
        }
    }

    public static void validateIdRoom(String idRoom) throws IdServicesException {
        pattern = Pattern.compile(ID_ROOM_RG);
        matcher = pattern.matcher(idRoom);
        if(!matcher.matches()){
            throw new IdServicesException("ID Room has a format SVRO-XXXX (X : 0 - 9 ) ");
        }
    }
    public static void validateIdEmployee(String idEmployee) throws IdServicesException {
        pattern = Pattern.compile(ID_EMPLOYEE);
        matcher = pattern.matcher(idEmployee);
        if(!matcher.matches()){
            throw new IdServicesException("ID Room has a format EP-XXXX (X : 0 - 9 ) ");
        }
    }

    public static void validateNameService(String nameService) throws NameServicesException {
        pattern = Pattern.compile(NAME_RG);
        matcher = pattern.matcher(nameService);
        if(!matcher.matches()){
            throw new NameServicesException("Name service must capitalize the first letter of each word ");
        }
    }

    public static void validateAreaService(String areaService) throws AreaServiceException {
        pattern = Pattern.compile(AREA_RG);
        matcher = pattern.matcher(areaService);
        if(!matcher.matches()){
            throw new AreaServiceException("Area service must be greater than 30 ");
        }
    }

    public static void validateCostService(String costService) throws CostServicesException {
        pattern = Pattern.compile(COST_RG);
        matcher = pattern.matcher(costService);
        if(!matcher.matches()){
            throw new CostServicesException("Cost services must be a positive ");
        }
    }

    public static void validateAmountPeopleService(String amountPeople) throws NumberFormatException {
        pattern = Pattern.compile(AMOUNT_PEOPLE_RG);
        matcher = pattern.matcher(amountPeople);
        if(!matcher.matches()){
            throw new NumberFormatException("Amount of people must be > 0  and < 20 ");
        }
    }

    public static void validateAccompaniedService(String accompaniedService) throws OptionServiceExcetion {
        pattern = Pattern.compile(ACCOMPANIED_SERVICES_RG);
        matcher = pattern.matcher(accompaniedService);
        if(!matcher.matches()){
            throw new OptionServiceExcetion("value : massage/karaoke/food/drink/car ");
        }
    }

    public static void validateNumberOfFloorService(String numberOfFlpor) throws NumberFormatException {
        pattern = Pattern.compile(NUMBER_FLOOR_RG);
        matcher = pattern.matcher(numberOfFlpor);
        if(!matcher.matches()){
            throw new NumberFormatException("Number of floor service must be greater zero ");
        }
    }

    public static void validateDateOfBirth(String numberOfFloor) throws DateOfBirthExcetion {
        pattern = Pattern.compile(DATE_OF_BIRTH_RG);
        matcher = pattern.matcher(numberOfFloor);
        if(!matcher.matches()){
            throw new DateOfBirthExcetion("Day of birth has a format dd/mm/yy and 18 years younger than the current date ");
        }
    }

    public static void validateNameCustomer(String NameCustomer) throws CustomerInformationException {
        pattern = Pattern.compile(NAME_RG);
        matcher = pattern.matcher(NameCustomer);
        if(!matcher.matches()){
            throw new CustomerInformationException("Name Customer must capitalize the first letter of each word ");
        }
    }

    public static void validateGender(String gender) throws CustomerInformationException {
        pattern = Pattern.compile(GENDER_RG);
        matcher = pattern.matcher(gender);
        if(!matcher.matches()){
            throw new CustomerInformationException("Gender : Male | Female | Unknow | ");
        }
    }

    public static void validateIdCard(String idCard) throws CustomerInformationException {
        pattern = Pattern.compile(ID_CARD_RG);
        matcher = pattern.matcher(idCard);
        if(!matcher.matches()){
            throw new CustomerInformationException("ID card has a fomart XXXXXXXXX (X : 0 - 9)");
        }
    }

    public static void validatePhoneNumber(String phoneNumber) throws CustomerInformationException {
        pattern = Pattern.compile(NUMBER_PHONE_RG);
        matcher = pattern.matcher(phoneNumber);
        if(!matcher.matches()){
            throw new CustomerInformationException("Phone number must include 10 digits");
        }
    }

    public static void validateEmail(String email) throws CustomerInformationException {
        pattern = Pattern.compile(EMAIL_RG);
        matcher = pattern.matcher(email);
        if(!matcher.matches()){
            throw new CustomerInformationException("Email has a format name@abc.com");
        }
    }

    public static void validateCustomerType(String customerType) throws CustomerInformationException {
        pattern = Pattern.compile(CUSTOMER_TYPE_RG);
        matcher = pattern.matcher(customerType);
        if(!matcher.matches()){
            throw new CustomerInformationException("Option : member|sliver|gold|platinum|diamond|Member|Sliver|Gold|Platinum|Diamond");
        }
    }

    public static void indexVillaException(String choiceVilla) throws IndexOutOfBoundsException, NumberFormatException {
        if (Integer.parseInt(choiceVilla) < 1 || Integer.parseInt(choiceVilla) > ReadFile.villaList.size()) {
            throw new IndexOutOfBoundsException("Choice the correct number of villa");
        }
    }

    public static void indexRoomException(String choiceRoom) throws IndexOutOfBoundsException, NumberFormatException {
        if (Integer.parseInt(choiceRoom) < 1 || Integer.parseInt(choiceRoom) > ReadFile.roomList.size()) {
            throw new IndexOutOfBoundsException("Choice the correct number of villa");
        }
    }

    public static void indexHouseException(String choiceHouse) throws IndexOutOfBoundsException, NumberFormatException {
        if (Integer.parseInt(choiceHouse) < 1 || Integer.parseInt(choiceHouse) > ReadFile.houseList.size()) {
            throw new IndexOutOfBoundsException("Choice the correct number of villa");
        }
    }

}
