package oct.ex_211024_ForLoop;

public class Lab101 {
    public static void main(String[] args) {
        for(int i=1; i<=50; i++){
            if(i%2==0){
                System.out.println(i+"even");
                continue;
            }
            System.out.println(i);
        }
    }
}
