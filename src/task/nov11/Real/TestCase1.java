package task.nov11.Real;

public class TestCase1 extends BaseClass {

    public TestCase1(){
        super();
        System.out.println("DC1 -TC1");
    }

    public void startTestCase(){
        openBrowser("chrome");
        closeBrowser();
    }

    public void setBrowser(String browser, boolean isAuth){
        System.out.println("own logic");
        super.setBrowser(browser,isAuth);
    }

//    public  String toString(){
//        return "TestCase1{}";
//    }
}
