import java.util.Scanner;

import Product.product;
import Product.Mobile.mobile;
import Product.Cooler.cooler;
import Product.Laptop.laptop;

public class first {
    public static void main(String[] args){
        System.out.println("-----------Welcome to Our Store---------");

        product p = new product();

        p.productList();
        Scanner scan = new Scanner(System.in);

        System.out.println(" ");

        System.out.print("Select Your Product:");

        p.selectedProduct = scan.nextLine();
        // System.out.println(" ");
        // System.out.println(" ");
        if (p.selectedProduct.equals("Mobile") || p.selectedProduct.equals("mobile"))
        {
            mobile m = new mobile();
            m.mobileData();   
        }
        else if(p.selectedProduct.equals("Cooler"))
        {
            cooler c = new cooler();
            c.coolerData();
        }
        else
        {
            laptop l = new laptop();
            l.laptopData();
        }
    }
}
