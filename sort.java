import java.util.*;
public class sort {
    public static void main(String[] args) {
        int [] arr= {8,9,8,7,6,3,2,4};
        // Arrays.sort(arr);
        Arrays.sort(arr,0,4);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    
}
