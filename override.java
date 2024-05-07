class Animal{
    void sound()
    {
        System.out.println("Animal Sound");
    }
    public void food()
    {
        System.out.println("Animal Food");

    }
}
class Dog extends Animal{
    void sound()
    {
        System.out.println("Barking,.,.,.Sound");
    }
    public void food()
    {
        System.out.println("Bisciuts");

    }

}
class Cat extends Animal{
    void sound()
    {
        System.out.println("Meow.,.,.,.,.,.,.,.Sound");
    }
    public void food()
    {
        System.out.println("Milk");

    }

}



public class override {
    public static void main(String[] args) {
        Animal obj ;
        obj = new Animal();
        obj.sound();
        obj.food();
        obj = new Dog();
        obj.sound();
        obj.food();
        obj = new Cat();
        obj.sound();
        obj.food();
        
        
    }
    
}
