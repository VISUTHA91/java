class student{
    int rollno;
    int age;
    String name;
    String dept;
    float fees;
    student( int rollno,String name,int age, String dept)
    {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
    student( int rollno,String name,int age, String dept, float fees)
    {
        this(rollno,name,age,dept);
        this.fees = fees;
    }
    void show(){
        System.out.println("Name :"+name);
        System.out.println("RollNo :" +rollno);
        System.out.println("Age :"+age);
        System.out.println("Dept :"+ dept);
        System.out.println("Fee :"+ fees);
        System.out.println("-----------");
    }
}
public class constructorchain{
    public static void main(String[] args) {
        student s1 = new student(11, "vino", 25, "Civil");
        student s2 = new student(12, "visu", 30, "EEE",50430);
        s1.show();
        s2.show();
    }
}