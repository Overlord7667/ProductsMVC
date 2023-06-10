package Controlers;

import Models.Product;
import Views.ProductView;

public class ProductControler {
    Product product;
    ProductView productView;

    public ProductControler(Product product, ProductView productView) {
        this.product = product;
        this.productView = productView;
    }
    public void SetProductName(String ProductName){
        product.setName(ProductName);
    }
    public void SetProductCategory(String ProductCategory){
        product.setCategory(ProductCategory);
    }
    public void SetPrice(double ProductPrice){
        product.setPrice(ProductPrice);
    }
    public void UpdateProductView(){
        productView.DisplayProduct(product);
    }
}
