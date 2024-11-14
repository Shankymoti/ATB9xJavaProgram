package task.nov14;

public class Lab166 {
    public static void main(String[] args) {
    Automation t1 = new Automation();
    Automation t2 = new Automation();

        System.out.println(t1.driver);
        System.out.println(t2.driver);
        System.out.println(Automation.driver);
    }
}

class Automation{
    static String driver = "chrome";
}