import java.util.Scanner;

public class threedarray {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int [][][] arr = new int[2][3][3];
        int [][] result = new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++)
                {
                    System.out.print("Enter the array values a["+i+"]"+"["+j+"]"+"["+k+"]:");
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }     
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++)
                {
                    System.out.print(arr[i][j][k]+"\t");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }  
        /////Addition
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++)
                {
                    result[j][k] += arr[i][j][k];
                }
            }
        } 
        System.out.println("Added Matrix");
        for(int j=0;j<result.length;j++)
        {
            for(int k=0;k<result[j].length;k++)
            {
                
                    System.out.print(result[j][k]+"\t");

            }
            System.out.println(" ");
        }  
    }
}