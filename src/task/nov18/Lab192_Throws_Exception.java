package task.nov18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab192_Throws_Exception {
    public static void main(String[] args) throws FileNotFoundException {
       FileInputStream file = new FileInputStream("C//abc.txt");
      //  FileReader f = new FileReader(new File("C://bnm.txt"));
    }
}
