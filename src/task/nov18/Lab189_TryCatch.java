package task.nov18;

public class Lab189_TryCatch {
    public static void main(String[] args) {
        try{
            String i  = "Pramod";
            String ip = args[0];//ArrayIndexOutOfBoundException
            int a =0;
            a = 100/0;//ArithmeticException
            i =null;
            System.out.println(i.trim());// NullPointerException
        }catch (Exception e){
            System.out.println("something went wrong");
            System.out.println(e.getMessage());
        }
    }
}
