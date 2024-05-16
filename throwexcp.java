import java.util.Scanner;

public class throwexcp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = scan.nextInt();
        if(age < 18 )
        {
            try
            {
                throw new invalidAgeException();
            }catch(invalidAgeException e)
            {
                System.out.println(e);
            }
            
        }
        else
        {
            System.out.println("Eligible for Voting");
        }
        System.out.println("end of the Program");
    }
    
}
