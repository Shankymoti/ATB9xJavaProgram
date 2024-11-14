package task.nov14;

public class Lab163_Static {
    public static void main(String[] args) {
    Student st = new Student(21);
       // System.out.println("Shashank");

        Student st2 = new Student(26);
        System.out.println(Student.school_name);
        Student.school_name = "ZXC";
        System.out.println(Student.school_name);
        System.out.println(st2.school_name);
    }
}

class Student{
    int age;
    static String school_name = "ABC";
   Student(int age)
    {
      this.age = age;
    }

    {
        System.out.println("instace initilization block");
        System.out.println("here we write a code what we want to do when object is created");
        System.out.println("Read a mySql db()");
    }

    static {
        System.out.println("static initiliazation block");
        System.out.println("load once when class is loaded");
        System.out.println("Read from excel file");
    }


}