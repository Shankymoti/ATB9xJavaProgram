package task.nov18;

import java.util.Scanner;

public class Lab185_Exception_Finally_Explain {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int x = sc.nextInt();
        try {
            int a = 10/0;
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            sc.close();
            System.out.println("closing sc");
        }
    }
}
