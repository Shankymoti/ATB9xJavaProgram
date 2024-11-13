package task.nov12;

public class Lab159 {
    public static void main(String[] args) {


    WagonR wr = new WagonR();
    wr.drive();
}
    }
    abstract class Engine{
        abstract void startEngine();
        abstract void stopEngine();
    }

    class WagonR extends Engine{
    void drive(){
        startEngine();
        stopEngine();
    }
    @Override
    void startEngine(){
        System.out.println("Start engine");
    }
    @Override
    void stopEngine(){
        System.out.println("Stop Engine");
    }
    }

