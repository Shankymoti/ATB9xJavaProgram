package task.nov15;

public class Lab174_Exception_Example {
    public static void main(String[] args) {
        System.out.println("Start of program");
        String s = args[0]; // provide 0 then it will throw arrayIndexOutOfBoundException
        int a = Integer.parseInt(s);
        int num = 100/a;

        System.out.println(num);

        System.out.println("end of program");
    }
}
