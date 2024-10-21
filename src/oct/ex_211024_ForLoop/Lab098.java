package oct.ex_211024_ForLoop;

public class Lab098 {
    public static void main(String[] args) {
        // find even and odd num from 1 to 50

        for(int i=1; i<=50; i++){
            if(i%2 == 0){
                System.out.println("even"+i);
            }else {
                System.out.println("odd"+i);
            }
        }
    }
}
