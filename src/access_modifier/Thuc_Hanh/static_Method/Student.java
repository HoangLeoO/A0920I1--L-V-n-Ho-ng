package access_modifier.Thuc_Hanh.static_Method;

public class Student {
    private int rollno ;
    private String name ;
    private static String college = "BBDIT";
    Student(int r , String n){
        rollno = r ;
        name = n ;
    }
    static  void change(){
        college = "Su Pham";
    }
    void  display(){
        System.out.println(rollno + " " + name + " " + college );
    }
}
