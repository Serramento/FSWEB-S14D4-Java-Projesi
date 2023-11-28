import tr.com.workintech.productForSale.Bread;
import tr.com.workintech.productForSale.Chocolate;
import tr.com.workintech.productForSale.Coke;
import tr.com.workintech.productForSale.ProductForSale;

public class Store {
    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate("Bitter", 5, "Sağlıklı, tadı yoğun.", 30);
        Coke coke= new Coke("Şekersiz", 35, "Sıfır şeker, yeni lezzet", 1);
        Bread bread= new Bread("Tam buğday",10,"Tam diyetinize uygun",250);

        ProductForSale[] prods= {chocolate, coke, bread};

        listProducts(prods);

        ProductForSale[] newProds= new ProductForSale[3];
        newProds[0] = chocolate;
        newProds[1]= coke;
        newProds[2]= bread;

        System.out.println("************************");

        listProducts(newProds);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products){
            product.showDetails();
        }
    }
}