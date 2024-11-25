package task.nov21;

public class Student {
    private String name;
    private Integer rollNo;

    Student(String name, Integer rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name =name;
    }

    public Integer getRollNo(){
        return rollNo;
    }
    public void setRollNo(Integer rollNo){
        this.rollNo = rollNo;
    }

    public void printDetails(){
        System.out.println(this.name);
        System.out.println(this.rollNo);
    }


}
