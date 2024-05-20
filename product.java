package Product;

public class product {
        public String  product[] = {"Mobile","Cooler","Laptop"};
        public String  Mobile[] = {"Samsung","Redmi","Huwai"};
        public String  Cooler[] = {"Bajaj","Voltas","BlueStar"};
        public String  Laptop[] = {"HP","Asus","Acer"};
        public String selectedProduct;
        public String selectedBrand;
        public void productList()
        {
            for(int i=0;i<product.length;i++)
            {
                System.out.print(product[i]+"\t\t");
            }
        }
}
