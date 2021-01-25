package myArrayList;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class test {
    public static class  Student {
        private     int id ;
        private  String name ;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Student a = new  Student(1 ,"A ");
            Student b = new  Student(2 ,"B ");
            Student c = new  Student(3 ,"C ");
            Student d = new  Student(4 ,"D ");
            Student e = new  Student(5 ,"E ");

            MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
            studentMyArrayList.add(a);
            studentMyArrayList.add(b);
            studentMyArrayList.add(c);
            studentMyArrayList.add(d);
            studentMyArrayList.add(e,2);
            studentMyArrayList.size();
            System.out.println(studentMyArrayList.size());

            System.out.println(studentMyArrayList.get(2).getName());

        }
    }
}
