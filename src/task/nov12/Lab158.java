package task.nov12;

public class Lab158 {
    public static void main(String[] args) {


        Child ch = new Child();
        ch.loan30k();
        ch.loan50k();
    }
}

class Child extends Father{
    @Override
    void loan30k() {
        System.out.println("30k loan");
    }
}
abstract class Father{
    abstract void loan30k();
    void loan50k(){
        System.out.println("50k loan");
    }
        }
