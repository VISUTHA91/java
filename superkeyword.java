class animals{
    String name = "Animals";
    void display(){
        System.out.println("Parent Class Called");
    }

}
class dog extends animals{
    String name = "Dog";
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Name : "+super.name);
        super.display();
    }
    
}
public class superkeyword {
    public static void main(String[] args) {
        dog d = new dog();
        d.display();        
    }
}
