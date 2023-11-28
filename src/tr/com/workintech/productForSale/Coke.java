package tr.com.workintech.productForSale;

public class Coke extends ProductForSale{
    private double litre;
    public Coke(String type, double price, String description, double litre) {
        super(type, price, description);
        this.litre= litre;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + "\n Price: " + getPrice() + "\n Litre: " + litre + "\n Description: " + getDescription());
    }
}
