import java.util.ArrayList;
import java.util.LinkedList;

class employee{
    int id;
    String name;
    Double salary;
    int age;
    String address;
    employee( int id , String name,Double salary,int age,String address)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.address = address;
    }
}
public class collection1 {
    public static void main(String[] args) {
        
        ArrayList <employee> list = new ArrayList<>();
        employee e = new employee(1, "visu", 30000.0, 30, "Madurai");
        employee e1 = new employee(2, "vino", 40000.0, 25, "Madurai");
        list.add(e);
        list.add(e1);
        System.out.println(list);
        for(employee ed:list){
            System.out.println(ed.id);
            System.out.println(ed.name);
            System.out.println(ed.age);
            System.out.println(ed.salary);
            System.out.println(ed.address);
        }
    }
    
}
