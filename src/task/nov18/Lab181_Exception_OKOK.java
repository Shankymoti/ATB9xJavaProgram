package task.nov18;

public class Lab181_Exception_OKOK {
    public static void main(String[] args) {
        int a =0;
        int b =0;
        try{
            b= 10/a;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(b); //java.lang.ArithematicException
    }
}
