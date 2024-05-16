class student{
    int id;
    String name;
    student (int id,String name)
    {
        this.id = id;
        this.name = name;
        addData(this);
    }
    void addData(student obj)
    {
        obj.id = 1;
        obj.name = "demo";
        System.out.println("ID : "+obj.id+"    "+ "NAME : "+obj.name);

    }
}

public class thismethod {
    public static void main(String[] args) {
        student s = new student(2, "demoooooo");
    }
    
}
