package task.nov18;

public class Lab184_Exception {
    public static void main(String[] args) {
        int a =0;
        try{
            int b= 10/a;
        }catch (Exception e){
           throw new RuntimeException(e);

        }
        System.out.println("End of PRogram");
    }
}
