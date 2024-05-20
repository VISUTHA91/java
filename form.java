package Product.Forms;

import java.util.Scanner;

public class form {
    String fullname;
    String address;
    String  mobilenumber;
    int Productid;
    int quantity;
    public void userdetails(String  product ,Double price)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Full Name :");
        fullname = scan.nextLine();
        System.out.print("Address   :");
        address = scan.nextLine();
        System.out.print("MobileNumber:");
        mobilenumber = scan.nextLine();
        System.out.print("Quantity    :");
        quantity = scan.nextInt();



        System.out.println("-------------------Bill------------------");
        System.out.println("Name         :"+fullname);
        System.out.println("Mobile Number:"+ mobilenumber);
        System.out.println("Addresss     :"+address);
        System.out.println("Quaninty     :"+quantity);
        System.out.println("Total Price  :" +quantity * price);

    }
    
}
