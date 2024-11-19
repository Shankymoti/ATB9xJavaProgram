package task.nov18;

public class Lab184_Exception_Finally {
    public static void main(String[] args) {
        int a =0;
        int b =0;
        try {
            b= 10/a;

        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I will be always executed");
        }
    }
}
