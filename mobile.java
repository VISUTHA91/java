package Product.Mobile;
import java.util.Scanner;
import Product.product;
import Product.Forms.form;

public class mobile {
    public double finalprice;
    public void mobileData()
    {
        product p = new product();
        for(int i = 0;i<p.Mobile.length;i++)
        {
            System.out.print(p.Mobile[i] +"\t\t");
        }
    Scanner scan = new Scanner(System.in);
    System.out.println(" ");
    System.out.println(" ");
    System.out.print("Select Your Brand:");
    p.selectedBrand = scan.nextLine();
    System.out.println("......."+p.selectedBrand+".......");
    switch(p.selectedBrand)
    {
        case "Samsung":
            System.out.println("Brand Name  :"+p.selectedBrand);
            System.out.println("Model No    :S50");
            System.out.println("Product Id  :475985");
            System.out.println("Price       :30000");
            System.out.println("Discount    :4%");
            finalprice = (30000-(30000*.04));
            System.out.println("Final Price :"+ finalprice);
            break;
        case "Redmi":
            System.out.println("Brand Name :Redmi");
            System.out.println("Model No   :R30");
            System.out.println("Product Id :4755485");
            System.out.println("Price      :25000");
            System.out.println("Discount   :4%");
            finalprice = (25000-(25000*.04));
            System.out.println("Final Price  :"+ finalprice);

            break;
        case "Huwai":
            System.out.println("Brand Name    :"+p.selectedBrand);
            System.out.println("Model No      :H40s");
            System.out.println("Product Id    :4755485");
            System.out.println("Price         :45000");
            System.out.println("Discount      :5%");
            finalprice = (45000-(45000*.05));
            System.out.println("Final Price   :"+ finalprice);
            break;
    }
    System.out.print("Buy Now" +"\t\t\t" +" Cancel"+"       --------->");
    String proceed = scan.nextLine();
    if(proceed.equals( "buynow"))
    {
        System.out.println("Enter Your Details for Billing");
        form f = new form();
        f.userdetails(p.selectedBrand , finalprice);
    }
    else{
        System.out.println("--------Thank You------");
    }
    }

}