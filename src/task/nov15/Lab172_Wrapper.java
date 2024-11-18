package task.nov15;

public class Lab172_Wrapper {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //Primitive to Wrapper
        int a =10;
        Integer b = a; // Boxing
        System.out.println(b);
        System.out.println(b.intValue());

  Integer c =100;
  int value = c; // Unboxing Integer -> int
        System.out.println(c);

    }
}
