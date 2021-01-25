package myLinkedList;

public class Test {
    public static void main(String[] args) {
        class Student{
            private  int id ;
            private String name ;

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
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"A");
        Student student2 = new Student(2,"B");
        Student student3 = new Student(3,"C");
        Student student4 = new Student(4,"D");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addFirst(student3);

        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();

        for(int i = 0 ; i < myLinkedList.size();i++){
            Student student = (Student) cloneLinkedList.get(i);
            System.out.println(student.getName());
        }
    }
}
