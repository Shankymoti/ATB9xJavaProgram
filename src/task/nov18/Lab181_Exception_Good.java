package task.nov18;

public class Lab181_Exception_Good {
    public static void main(String[] args) {
        int a= 0;
        int b =0;
        try{
            b= 100/a;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println(b);//java.lang.ArithmeticException
    }
}
