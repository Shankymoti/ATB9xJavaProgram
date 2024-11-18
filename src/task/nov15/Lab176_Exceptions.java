package task.nov15;

import java.io.FileInputStream;

public class Lab176_Exceptions {
    public static void main(String[] args) {
        //Checked Exception - JVM knows - CompileTime Exception

     //FileInputStream file =  new FileInputStream("C://a.txt");
        //FileNotFoundException - JVM knows this may lead Exception


//Unchecked Exception - JVM does not know  - Run time Exception
        int a =10; int b=2;
        b=0;
        int c =a/b; //Arithematic Exception
        System.out.println();
    }
}
