package task.nov18;

public class Lab190_Interview_Exceptions {
    public static void main(String[] args) {

        int a=0;
        try{
            int x = 10/a;
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("div by Zero");
        }finally {
            System.out.println("I will be executed any how!");
        }
    }
}
