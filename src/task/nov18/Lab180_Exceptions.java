package task.nov18;

public class Lab180_Exceptions {
    public static void main(String[] args) {
        int a =0;
        int c=0;
        try{
            c = 100/a;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
