package task.nov15;

public class Lab178_Exception_Handles {
    public static void main(String[] args) {
        System.out.println("Start the program");
        String str = null;
        try {
            str =  str.trim();
        } catch (Exception e) {
          //  throw new RuntimeException(e);
            System.out.println("Can not do trim for null");
        }
        System.out.println(str);
        System.out.println("End of program");
    }
}
