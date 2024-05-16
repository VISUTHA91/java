import java.util.Scanner;
class student
{
    private int id;
    private String name;
    private int age;
    private int mark;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return this.mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

}

public class encaptask {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            student s = new student();
            Scanner scan = new Scanner(System.in);
            s = new student();
            System.out.println("Enter Your Name:" );
            String n = scan.nextLine();
            s.setName(n);
            System.out.println("Enter Your ID:" );
            int idd = scan.nextInt();
            s.setId(idd);
        //  scan.nextLine();
    
            System.out.println("Enter Your Age:" );
            int a = scan.nextInt();
             s.setAge(a);
            System.out.println("Enter Your Mark:" );
            int m = scan.nextInt();
            s.setMark(m);
    
        System.out.println("Name:"+s.getName()+" "+"ID: "+s.getId()+" "+"Age: "+s.getAge()+" "+"Mark:"+s.getMark());
    }


    }
    
}
