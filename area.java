import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        area a = new area();
        System.out.println("Area Of Rectangle");
        a.setDim();
    }
    void setDim(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length and Breath of the rectangle : ");
        int l = scan.nextInt();
        int b= scan.nextInt();
        System.out.println(" Area of Rectangle : "+ getArea(l, b));
    }
    int getArea(int l,int b){
        
        int result = l*b;
        return result;
    }
}
