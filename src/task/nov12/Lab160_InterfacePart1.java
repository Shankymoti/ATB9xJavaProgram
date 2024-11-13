package task.nov12;

public class Lab160_InterfacePart1 {
}

abstract class ABC{
    ABC(){

    }
    abstract void a1();
    void a2(){
        System.out.println("a2");
    }
}

interface I{
    void m1();
    void m2();
//     void m3(){
//
//     }

    default void m4(){
        System.out.println("Default method in Interface");
    }
    static void m5(){
        System.out.println("Static method in interface");
    }
}
