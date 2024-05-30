import java.util.HashSet;

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


public class CollectionHashset1 {
    public static void main(String[] args) {
        HashSet<employee> emp = new HashSet<>();
        employee e = new employee(1, "Visutha", 40000.0, 30, "Madurai");
        emp.add(e);
        System.out.println(emp);
        for(employee ed:emp){
            System.out.println(ed.id);
            System.out.println(ed.name);
            System.out.println(ed.age);
            System.out.println(ed.salary);
            System.out.println(ed.address);
        }
        
    }

   
    
}
