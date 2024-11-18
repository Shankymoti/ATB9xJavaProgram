package task.nov15;

public class Lab173_Conversion {
    public static void main(String[] args) {
        //String - Wrapper(Integer) -> int (primitive type)
        String num = "10";
        Integer a = Integer.valueOf(num);
        System.out.println(a.intValue());
        int b = a;
//=====================================================================
        // primitive to Sting
        String num1 = String.valueOf(b);
        String str = num1+num1;
        System.out.println(str);

//=========================================================================
        String str1 = "100";
        Integer s = Integer.valueOf(str1);
        System.out.println(s.intValue());
        // String to primitive
        String st = "120";
        int newnum = Integer.parseInt(st);
        System.out.println(newnum);


        //==============================================================
        //Wrapper to String
        Integer i = 10;
        String s11 = i.toString();
        System.out.println(s11.equals("10"));

        //===============================================================
    // valueOf()  -> primitive or String to Wrapper
        // parseXYZ() -> String to primitive type




    }
}
