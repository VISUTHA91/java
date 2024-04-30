import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        String reverse="";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String:");
        String data = scan.nextLine(); 
        for(int i = data.length()-1; i>=0; i--)
        {
            reverse += data.charAt(i);
        }
        if(data.equals(reverse))
        {
            System.out.println("Palindrom");
        }else
        {
            System.out.println("Not Palindrom");

        }

    }
    
}