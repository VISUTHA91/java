class student
{
    private int id;
    private String name;
    private int age;

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

}
public class encapsulation {
    public static void main(String[] args) {
        



        student s = new student();
        s.setId(1);
        s.setName("visutha");
        s.setAge(25);
        System.out.println(s.getId()+ s.getName()+ s.getAge());
        student ss = new student();
        ss.setId(1);
        ss.setName("visutha");
        ss.setAge(25);
        System.out.println(ss.getId()+ ss.getName()+ ss.getAge());
    }
    
}
