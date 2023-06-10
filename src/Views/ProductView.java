package Views;

import Models.Product;

public class ProductView {
    public void DisplayProduct(Product product){
        System.out.println("Product details :");
        System.out.println("Name : " + product.getName() +"\n"+ "Category : " + product.getCategory() +"\n"+ "Price : " + product.getPrice()+"¥");
    }
}
