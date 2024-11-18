package task.nov15;

public class Lab175_Exception_Example {
    public static void main(String[] args) {
        String s = args[0]; // ArrayIndexOutOfBound
        int a = Integer.parseInt(s); //NumberFormatException
        int num = 100/a; // Arthrmatic Exception

        System.out.println(num);
        System.out.println("end of program");
    }
}
