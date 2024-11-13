package task.nov12;

public class Lab155_Super {
    public static void main(String[] args) {
    Car c = new Car();

    }
}

class Vehicle {
    public int maxSpeed = 180;

    Vehicle() {
        System.out.println("DC Vehicle");
    }
    Vehicle(int a){
        System.out.println("PC Vehicle"+a);
    }

    public void display(){
        System.out.println("Parent");
    }

    void message(){
        System.out.println("Hello");
    }
    void message(int a){
        System.out.println("hello");
    }
}

class Car extends Vehicle{
  private int maxSpeed =220;
    public void display(){
        System.out.println("child");
    }
    Car(){
        super(10);
        System.out.println("DC Car");
        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);
        super.display();
        this.display();
    }
}
