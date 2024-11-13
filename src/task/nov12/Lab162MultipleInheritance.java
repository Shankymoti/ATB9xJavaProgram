package task.nov12;

public class Lab162MultipleInheritance {
    public static void main(String[] args) {


        Child1 ch1 = new Child1();
        ch1.f1();
        ch1.same();
        ch1.f3();
    }
}
interface Father1{
    public void f1();
    void f2();
    void same();
}
interface Mother1{
    void f3();
    public void f4();
    void same();
}

class Child1 implements Father1,Mother1{

    @Override
    public void f1() {
        System.out.println("f1");
    }

    @Override
    public void f2() {
        System.out.println("f2");

    }

    @Override
    public void f3() {
        System.out.println("f3");
    }

    @Override
    public void f4() {
        System.out.println("f4");
    }

    @Override
    public void same() {
        System.out.println("same");
    }
}
