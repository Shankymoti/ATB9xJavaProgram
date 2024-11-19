package task.nov18;

public class Lab188_Multiple_TryCatch {
    public static void main(String[] args) {


    String ip = null;
    try{
        ip = args[0];
    }catch (ArrayIndexOutOfBoundsException e){
        throw new RuntimeException(e);
    }
    int a =0;
    try{
        a= Integer.parseInt(ip);
    }catch (NumberFormatException e) {
        throw new RuntimeException(e);
    }
//    }finally {
//        System.out.println("in the middle of program");
//    }
    int b =0;
    try{
        b = 100/a;
    }catch (ArithmeticException e){
        throw new RuntimeException(e);
    }
//    finally {
//        System.out.println("end of Program");
//    }
}
}