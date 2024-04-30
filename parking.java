import java.util.Scanner;

public class parking {
    static int space = 10;        
    public static void main(String[] args) 
    {
        parking p = new parking();
        while(true)
        {
        Scanner scan = new Scanner(System.in);
        System.out.println("Available Spaces :" + space);
        System.out.println("1.Park a car");
        System.out.println("2.Remove  a car");
        System.out.println("3.Exit");
        System.out.println("Enter your choice:");
        int num = scan.nextInt();
        switch(num)
        {
        case 1:
            System.out.println("Sucess fully parked");
            p.spaceremove();
            break;
    
        case 2:
            System.out.println("Car Moved");
            p.spaceadd();
            break;

        case 3:
            // System.out.println("Exit");
            scan.close();
            break;           
        }
    }
}
       
    void spaceremove()
        {
             space = space-1;
            // System.out.println("Available Space : "+ space);
        }
        void spaceadd()
        {
        //  System.out.println("Available Spaces: "+ space);
        space = space +1;
        }
    }

