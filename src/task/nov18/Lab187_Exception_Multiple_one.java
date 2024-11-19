package task.nov18;

public class Lab187_Exception_Multiple_one {
    public static void main(String[] args) {
        System.out.println("Start Program");
       try {
           String str = args[0];// ArrayIndexOutOfBoundException
           int a = Integer.parseInt(str); //NumberFormatException
           int b= 100/a;//ArithmeticException
       }catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e){
           System.out.println(e.getMessage());
       }
       finally {
           System.out.println("end of Program");
       }
    }
}
