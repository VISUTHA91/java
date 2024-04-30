import java.util.Scanner;

public class biggest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Three Numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a>=b && a>=c){
            System.out.println("Biggest Number is" + a);
        }
        else if(b>=a && b>=c){
            System.out.println("Biggest Number is" + b);
        }
        else{
            System.out.println("Biggest Number is" + c);

        }
    }
    
}
