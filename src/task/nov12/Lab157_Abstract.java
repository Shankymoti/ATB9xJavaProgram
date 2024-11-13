package task.nov12;

public class Lab157_Abstract {
}

abstract class Loan{
    abstract void loan30K();
    abstract void loan50k();

    void loan1L(){
        System.out.println("1L loan is there");
    }
}

class Shashank extends Loan{

    @Override
    void loan30K() {
        System.out.println(" 30k loan");
    }
    @Override
    void loan50k(){
        System.out.println("50 k loan");

    }
}

//Concreate class
class Student{}
class Teacher{}
