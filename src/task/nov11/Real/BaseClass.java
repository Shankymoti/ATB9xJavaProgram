package task.nov11.Real;

public class BaseClass {
    private String browser;
    public BaseClass(){
        System.out.println("DC- Base Class");
    }
    public BaseClass(String b){
        System.out.println("CC - Base Class");
    }

    public String getBrowser(){
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth){
        if(isAuth){
            this.browser = browser;
        }else {
            System.out.println("Not Allowed");
        }
    }

    public void openBrowser(){
        System.out.println("opening browser");
    }
    public void openBrowser(String browserName){
        System.out.println("open browser"+browserName);
    }

    public void closeBrowser(){
        System.out.println("close browser");
    }




}
