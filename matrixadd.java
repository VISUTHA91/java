import java.util.Scanner;
public class matrixadd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [][] arr1 = new int[3][3];
        int [][] arr2 = new int[3][3];
        int [][] arr3 = new int[3][3];
        for( int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++){
                System.out.print("Enter 1st array values["+i+"]"+"["+j+"]:");
                arr1[i][j] = scan.nextInt();
            }
        }
        for( int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++){
                System.out.print("Enter  2nd array values["+i+"]"+"["+j+"]:");
                arr2[i][j] = scan.nextInt();
            }
        }
        ////print
        for( int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("  ");
        for( int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println("");
        }
        ///Addition
        for( int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
    System.out.println("Added Array");
        for( int i=0;i<arr3.length;i++)
        {
            for(int j=0;j<arr3[i].length;j++)
            {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
