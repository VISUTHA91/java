package Product.Cooler;

import java.util.Scanner;

import Product.product;
import Product.Forms.form;

public class cooler {
    double finalprice;
    public void coolerData()
    {
        product p = new product();
        for(int i = 0;i<p.Cooler.length;i++)
        {
            System.out.print(p.Cooler[i] +"\t\t");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Select Your Brand:");
        p.selectedBrand = scan.nextLine();
        System.out.println("......."+p.selectedBrand+".......");
        switch(p.selectedBrand)
        {
            case "Bajaj":
            System.out.println("Brand Name  :"+p.selectedBrand);
            System.out.println("Model No    :B4s7");
            System.out.println("Product Id  :475985");
            System.out.println("Price       :10000");
            System.out.println("Discount    :4%");
            finalprice = (10000-(10000*.04));
            System.out.println("Final Price :"+ finalprice);
            break;
        case "Voltas":
            System.out.println("Brand Name :"+p.selectedBrand);
            System.out.println("Model No   :VS14");
            System.out.println("Product Id :4755485");
            System.out.println("Price      :15000");
            System.out.println("Discount   :4%");
            finalprice = (15000-(15000*.04));
            System.out.println("Final Price  :"+ finalprice);

            break;
        case "Bluestar":
            System.out.println("Brand Name    :"+p.selectedBrand);
            System.out.println("Model No      :B14s");
            System.out.println("Product Id    :4755485");
            System.out.println("Price         :13000");
            System.out.println("Discount      :5%");
            finalprice = (13000-(13000*.05));
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
