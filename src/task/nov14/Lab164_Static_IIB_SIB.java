package task.nov14;

public class Lab164_Static_IIB_SIB {

    public static void main(String[] args) {
        A a = new A();
        A a2  = new A();
       new A();
        A a3;
    }
}

class A{
    static {
        System.out.println("SIB");
    }
    {
        System.out.println("IIB");
    }
}