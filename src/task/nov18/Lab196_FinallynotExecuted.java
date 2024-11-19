package task.nov18;

public class Lab196_FinallynotExecuted {
    public static void main(String[] args) {
        try{
            int a = 10/10;
           // System.exit(0);
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            System.out.println("Not printed");
        }
    }
}
