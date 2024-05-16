class student{
    //instance variale
    int rollno;
    int age;
    String name;
    String dept;
    void data( int rollno,String name,int age, String dept)
    {
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
        display();
    }
    void display(){
        System.out.println("Display called");

    }
}

public class thiskeyword {
    public static void main(String[] args) {
        student obj = new student();
        obj.data(11,"Abi",20,"cse");
        obj.show();
        
    }
    
}
