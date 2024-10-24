package task.oct23;
import java.util.Scanner;
public class SumSubMulDivMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = addition(a, b);
        System.out.println("Addition :"+sum);

        int sub = substraction(a, b);
        System.out.println("Substraction : "+sub);

        int mul = multiplication(a, b);
        System.out.println("Multiplication : "+mul);

        int div = division(a,b);
        System.out.println("Division : "+div);

        int mod = modulus(a,b);
        System.out.println("Modulus : "+mod);
    }
    public static int addition(int a, int b){
        return a+b;
    }
    public static int substraction(int a, int b){
        return a-b;
    }
    public static int multiplication(int p,int q){
        int z= p*q;
        return z;
    }
    public static int division(int m, int n){
        return m/n;
    }
    public static int modulus(int a, int b){
        return a%b;
    }

}
