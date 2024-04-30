import java.util.Scanner;

public class naturalnumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number:");
         int n = scan.nextInt();
         System.out.println("Natural Numbers are:");
         for(int i=0; i<=n; i++)
         {
            System.out.println(i);
         }
          int sum = n*(n+1)/2;
         System.out.println("Sum of the numbers is:"+sum);
    }
    
}
