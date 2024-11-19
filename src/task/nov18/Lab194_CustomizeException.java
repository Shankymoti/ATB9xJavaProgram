package task.nov18;

public class Lab194_CustomizeException {
    public static void main(String[] args) {
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR", 200);
        System.out.println(sbi.add(icici));
        System.out.println(sbi.add(sbi));
        Bank jp_ch = new Bank("USD", 80);
        System.out.println(sbi.add(jp_ch));
    }
}
