package task.nov11.main;

import task.nov11.Real.TestCase1;

public class Main {
    public static void main(String[] args){
        TestCase1 tc1 = new TestCase1();
        tc1.setBrowser("chrome",true);
        tc1.startTestCase();
        tc1.closeBrowser();
    }
}
