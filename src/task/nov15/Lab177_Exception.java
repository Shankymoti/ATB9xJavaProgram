package task.nov15;

public class Lab177_Exception {
    public static void main(String[] args) {
        System.out.println("Start the program");
        String str =  null;
        str = str.trim();
        System.out.println(str);
        System.out.println("end of program");
    }
}

// Unchecked Exception
// Compile  - no issue - JVM does not knon
// java.lang.NullPointerException - jvm know at run time  -  terminate the program - means it is not going to execute last 2 lines
