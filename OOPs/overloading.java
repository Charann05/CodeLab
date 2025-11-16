//Method overloading.

package Java_Samples.OOPS;

class Student{
    String name;
    int age;
    public void print(String name){
        System.out.println(name);
    }
    public void print(int age){
        System.out.println(age);
    }
    public void print(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }
    /*Student( Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){}*/
}

public class overloading {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Anup";
        s1.age = 23;
        s1.print(s1.age);
        s1.print(s1.name, s1.age);
        s1.print(s1.name);

        Student s2 = new Student();
        s2.name = "Ramesh";
        s2.age = 33;
        s2.print(s2.name);
    }
}
