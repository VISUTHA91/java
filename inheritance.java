class vechicle{
    String brand;
    String color;
    String name;
    int weight;
    void weight()
    {
        System.out.println("weight:  " +weight);
    }
}
class twowheelar extends vechicle{
    void display(){
        System.out.println("Brand : "+ brand);
        System.out.println("Color : "+ color);
        System.out.println("Name : "+ name);
    }
}
class fourwheelar extends vechicle{
    void display(){
        System.out.println("------Four Wheelar-----");
        System.out.println("Brand : "+ brand);
        System.out.println("Color : "+ color);
        System.out.println("Name : "+ name);
    }
}

public class inheritance {
    public static void main(String[] args) {
        twowheelar two = new twowheelar();
            two.brand = "HONDA";
            two.color = "white";
            two.name = "Activa"; 
            two.weight = 110; 

            two.display();
            two.weight();

            fourwheelar four = new fourwheelar();
            four.brand = "TATA";
            four.color = "Black";
            four.name = "Tigor";
            four.weight = 1100;

            four.display();
            four.weight();
    }
    
}
