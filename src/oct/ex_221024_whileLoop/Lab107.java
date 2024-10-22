package oct.ex_221024_whileLoop;

public class Lab107 {
    public static void main(String[] args) {
        // Two Ways
        // 1 Arguments
        // 2. Scanner Class
        // 3. BufferReader - R

        String args1 = args[0];

        int age = Integer.parseInt(args1);
        while(age>0){
            System.out.println(age);
            age--;
        }
    }
}
