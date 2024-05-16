public class encp2 {
    public static void main(String[] args) {
        int a[] = new int[10];
        try
        {
        a[10] = 2 / 0 ;
        }
        catch(NullPointerException  | ArithmeticException  | ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        // catch(ArithmeticException e)
        // {
        //     System.out.println(e);
        // }
        // catch(ArrayIndexOutOfBoundsException e)
        // {
        //     System.out.println(e);
        // }
        System.out.println("End of the Program");
    }
    
}
