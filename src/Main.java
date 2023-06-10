import Controlers.ProductControler;
import Models.Product;
import Views.ProductView;

public class Main {
    public static void main(String[] args) {
        Product model = new Product();
        ProductView view = new ProductView();
        ProductControler controler = new ProductControler(model, view);

        controler.SetProductName("Rolls");
        controler.SetProductCategory("Japanese food");
        controler.SetPrice(120);

        controler.UpdateProductView();
    }
}