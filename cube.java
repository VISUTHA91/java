import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Number is "+i+" and cube of "+i+" is "+i*i*i);
        }
        
    }
    
}
