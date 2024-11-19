package task.nov18;

public class Lab186_Multiple_Catches {
    public static void main(String[] args) {
//        int a  = Integer.parseInt(args[0]);
//        System.out.println(a);

//        String arr[] = {};
//        System.out.println(arr[0]);
        System.out.println("start program");
        try {


            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundException
            int a = Integer.parseInt(ip);//java.lang.NumberFormatException
            int b = 10 / a; // java.lang.ArithematicException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("end of program");
        }
    }
}
