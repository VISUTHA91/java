public class excp3 {
    public static void main(String[] args) {
        int a[] = new int[10];
        try
        {
            try
                {
                    System.out.println("Arithmatic try block called");
                    a[10] = 2 / 2 ;
                }
                catch(ArithmeticException e)
                {
                    System.out.println(e);
                }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    
    }
    
}
