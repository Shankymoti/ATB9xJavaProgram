package task.nov18;

public class Lab182_Exception_OKOK {
    public static void main(String[] args) {
        int a =0;
        int c= 0;
        try {
            c = 100/a;
            String str = null;
            str.trim();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
