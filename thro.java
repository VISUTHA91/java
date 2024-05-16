import java.util.Scanner;
/**
 * throwsexcp
 */
class Demo {
    void division(int x,int y) throws ArithmeticException,NullPointerException
    {
        int result = x/y;
        System.out.println(result);
    }
}
public class thro{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enteer Two Number : ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        Demo obj = new Demo();
        try
        {
            obj.division(x,y);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("End of the Program");
    }
}