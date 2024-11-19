package task.nov18;

public class Lab195_string {
    public static void main(String[] args) {
        String a ="10";
        String b = "20";
        String c = a+b;
        System.out.println(c);

        try{
            int j =10/0;
        }catch (Exception e){
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println("Div by zero!");
        }

    }
}
