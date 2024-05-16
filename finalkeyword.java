final class student
{
    final int id ;
    student()
    {
         id = 10;
    }
    final void display()
    {
        System.out.println("Student Class Called");
    }
}
// class teacher extends student{        // this class canot use bocz final keyword in class student
//     void display(){
//         super.display();
//         System.out.println("Teacher Class Called");

//     }
// }
public class finalkeyword {
    public static void main(String[] args) {
        student s = new student();
        // s.id = 20;
        System.out.println("no:"+ s.id);
        // teacher t = new teacher();bocz final keyword in class student
        // t.display();
    }
    
}
