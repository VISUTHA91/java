class student{
    int rollno;
    int age;
    String name;
    String dept;
    student()//default Constructor
    {
        this(11,"bisu",20,"IT");//parametarized Constructor
        System.out.println("Default Constructor Called");
    }

    student( int rollno,String name,int age, String dept)//parameterized constructor
    {
        // this();//Calling Default Contructor
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
    void show(){
        System.out.println("Name :"+name);
        System.out.println("RollNo :" +rollno);
        System.out.println("Age :"+age);
        System.out.println("Dept :"+ dept);
    }
}
public class thistypes{
    public static void main(String[] args) {
        student s = new student();
        s.show();
    }
}