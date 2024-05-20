package Product.Laptop;

import java.util.Scanner;

import Product.product;
import Product.Forms.form;

public class laptop {
    double finalprice;
    public void laptopData()
    {
        product p = new product();
        for(int i = 0;i<p.Laptop.length;i++)
        {
        System.out.print(p.Laptop[i] +"\t\t");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Select Your Brand:");
        p.selectedBrand = scan.nextLine();
        System.out.println("......."+p.selectedBrand+".......");
        switch(p.selectedBrand)
        {
            case "HP":
            System.out.println("Brand Name  :"+p.selectedBrand);
            System.out.println("Model No    :f15S");
            System.out.println("Product Id  :475985");
            System.out.println("Price       :50000");
            System.out.println("Discount    :4%");
            finalprice = (50000-(50000*.04));
            System.out.println("Final Price :"+ finalprice);
            break;
        case "Asus":
            System.out.println("Brand Name :"+p.selectedBrand);
            System.out.println("Model No   :Notebook");
            System.out.println("Product Id :4755485");
            System.out.println("Price      :45000");
            System.out.println("Discount   :4%");
            finalprice = (45000-(45000*.04));
            System.out.println("Final Price  :"+ finalprice);

            break;
        case "Acer":
            System.out.println("Brand Name    :"+p.selectedBrand);
            System.out.println("Model No      :HA14s");
            System.out.println("Product Id    :4755485");
            System.out.println("Price         :55000");
            System.out.println("Discount      :5%");
            finalprice = (55000-(55000*.05));
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
        else
        {
            System.out.println("--------Thank You------");
        }
    }
}
