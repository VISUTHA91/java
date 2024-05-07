import ChildPackage.Dog;
import ChildPackage.Cow;

public class Packageinheritance {
        public static void main(String[] args) {
            Dog d = new Dog();
                d.name = "Dog";    
                d.color = "white";
                d.sound = "Barking"; 
    
                d.display();
                d.sound();
    
                Cow c = new Cow();
                c.color = "Black";
                c.name = "Cow";
                c.sound = "Meow Meow";
    
                c.display();
                c.sound();
        }
        
    }
