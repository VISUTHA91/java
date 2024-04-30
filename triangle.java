import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Three Side of the Triangle:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a == b && b==c && c==a)
        {
            System.out.println("Equilateral");
        }
        else if(a == b || b==c || c==a)
        {
            System.out.println("isosceles");
        }
        else if(a!=b && b!=c && c!=a)
        {
            System.out.println("Scalene");

        }
    }
    
}
