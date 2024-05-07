class A{
    int id;
    void display1(){
        System.out.println("Class A called");
    }

}
class B extends A{
String name;
    void display2()
    {
        System.out.println("Class B called");
    }

}
class C extends B{
   int age;
   C(int i,String n ,int a)
   { 
    id = i;
    name = n;
    age = a;

   }
    void display3()
    {
        System.out.println("Class C called");
        System.out.println("id :"+id+" Name  :"+name+"  Age :"+age);
    }

}
class D extends B{
    void display4()
    {
        System.out.println("Class D called");
    }

}


public class multilevel {
    public static void main(String[] args) {
        C obj = new C(1,"visu",29);
        obj.display1();
        obj.display2();
        obj.display3();
        System.out.println("<-------------------->");


        D object = new D();
        object.display1();
        object.display2();
        object.display4();

        
    }
    
}
