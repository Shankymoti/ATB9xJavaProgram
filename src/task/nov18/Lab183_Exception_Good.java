package task.nov18;

public class Lab183_Exception_Good {
    public static void main(String[] args) {
        int a=0;
        int b= 0;
        try {
            b= 10/a;
            String str = null;
            str.trim();
        }catch (ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
