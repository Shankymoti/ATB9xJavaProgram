package task.nov18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab193_TryCatchP2 {
    public static void main(String[] args) {
        try{
            FileInputStream file = new FileInputStream("C;//abc.txt");
        }catch (FileNotFoundException e){
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println("file is not there");
        }finally {
            System.out.println("End of program");
        }
    }
}
