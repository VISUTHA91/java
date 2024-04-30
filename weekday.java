import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number(1-7):");
        int num = scan.nextInt();
        switch(num)
        {
            case 1:
            System.out.println("Number "+num+" is Monday");
            break;
            case 2:
            System.out.println("Number "+num+" is TuesDay");
            break;
            case 3:
            System.out.println("Number "+num+" is Wednesday");
            break;
            case 4:
            System.out.println("Number "+num+" is Thursday");
            break;
            case 5:
            System.out.println("Number "+num+" is Frioday");
            break;
            case 6:
            System.out.println("Number "+num+" is Saturday");
            break;
            case 7:
            System.out.println("Number "+num+" is Sunday");
            break;
        }
    }
    
}
