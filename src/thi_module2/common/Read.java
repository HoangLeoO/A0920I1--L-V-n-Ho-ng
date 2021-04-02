package thi_module2.common;


import thi_module2.sp.San_pham_nk;
import thi_module2.sp.San_pham_xk;

import java.util.ArrayList;
import java.util.List;

public class Read {
    public static final String COMMA = ",";
    public static final String PATH_FILE_SPNK = "src/thi_module2/data/san_pham_nk.csv";
    public static final String PATH_FILE_SPXK = "src/thi_module2/data/san_pham_xk.csv";
    public static List<San_pham_nk> spnkList;
    public static List<San_pham_xk> spxkList;

    public static void readFileSPNK() {
        spnkList = new ArrayList<>();
        List<String> stringList = File.readFromFile(PATH_FILE_SPNK);
        for (String string : stringList) {
            String[] stringSplit = string.split(",");
            San_pham_nk spnk = new San_pham_nk(Integer.parseInt(stringSplit[0]), stringSplit[1],stringSplit[2] ,Double.parseDouble(stringSplit[3]),Integer.parseInt(stringSplit[4])
                    ,stringSplit[5],Double.parseDouble(stringSplit[6]),Double.parseDouble(stringSplit[7]));
            spnkList.add(spnk);
        }

    }
    public static void readFileSPXK(){
        spxkList = new ArrayList<>();
        List<String> stringList = File.readFromFile(PATH_FILE_SPXK);
        for (String string : stringList) {
            String[] stringSplit = string.split(",");
            San_pham_xk san_pham_xk = new San_pham_xk(Integer.parseInt(stringSplit[0]),stringSplit[1],stringSplit[2],Double.parseDouble(stringSplit[3]),Integer.parseInt(stringSplit[4]),
                    stringSplit[5],Double.parseDouble(stringSplit[6]),stringSplit[7]);
            spxkList.add(san_pham_xk);
        }
    }

}
