package task.nov14;

public class Lab165_Static_SIB_IIB {
    public static void main(String[] args) {
    ATB atb = new ATB("Shahsank");
    atb.setName("Java");
        System.out.println(atb.getName());

        atb.setPhone("897970970");
        System.out.println(atb.getName());

        ATB atb1 = new ATB("Promod");

        atb1.readDoc();
        atb.readDoc();

        //static
        ATB.doAssignment();
        System.out.println(ATB.courseName);
      //  ATB.courseName= "SELENIUM";
        System.out.println(ATB.courseName);
    }
}

class ATB{
    {
        System.out.println("Read file from Excel ");
    }
    static {
        System.out.println("Load the class, I wil execute");
    }

    private String name;
    private String phone;
    static String courseName;

    public String getName(){
        return name;
    }
    ATB(String name){
        this.name = name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public void readDoc(){
        System.out.println("Non static variable");
        System.out.println(courseName);
    }
    static  void doAssignment(){
        System.out.println("Static method");
        System.out.println(courseName);
    }

    static class test{}
}
