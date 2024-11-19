package task.nov18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab191_Checked_UnCheckedException {
    public static void main(String[] args) {
        try{
            int a =10/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("unchecked Exception");
        }

       try{
           FileReader fr =  new FileReader(new File("C//abc.txt"));
       }catch (FileNotFoundException e){
           System.out.println(e.getMessage());
       }finally {
           System.out.println("checked exception");
       }
    }
}
