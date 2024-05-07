class vechicle{
    String name;
    void car(String name){
        System.out.println(name);
    }
    void car(String name ,int mno ){
        System.out.println(name +" "+ mno);
    }
}


public class overload {
    public static void main(String[] args) {
        vechicle obj = new vechicle();
        obj.car("TATA");
        obj.car("TATA",2024);   
    }
    
}
