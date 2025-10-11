//Objects and Classes.

package Java_Samples.OOPS;

class Student{
    String name;
    int age;
    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    /*Student( Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){}*/
}

public class obclass {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Anup";
        s1.age = 23;
        s1.print();

        //Student s2 = new Student("Rakesh", 33);
        //Student s2 = new Student(s1);
        //s2.name = "Ramesh";
        //s2.age = 33;
        //s2.print();
    }
}
