package task.nov19;

public class Lab197_Generic_Solution {
    public static void main(String[] args) {
tempFun(100,200);
tempFun("shashank","kumar");
tempFun("pramod", "dutta");
tempFun(true,false);
    }

    public  static <shashank> shashank tempFun(shashank a, shashank b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
