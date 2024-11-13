package task.nov12;

public class Lab161_Interface_Part2 {
    public static void main(String[] args) {


        Test t = new Test();
        t.f1();
        t.f2();
    }
}
interface Im{
    void f1();
    void f2();
    void f3();
}

class Test implements Im{
    @Override
    public void f1(){
        System.out.println("f1");
    }
    @Override
    public void f2(){
        System.out.println("f2");
    }
    @Override
    public void f3(){
        System.out.println("f3");
    }
}
