package s102_Exceptions.S102_N1exercise1;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> productsCollection;
    private double totalSalesPrice;

    public Sale(){
        this.productsCollection = new ArrayList<>();
        this.totalSalesPrice = 0;
    }
    public ArrayList<Product> getProductsCollection() {
        return this.productsCollection;
    }
    public double getTotalSalesPrice() {
        return this.totalSalesPrice;
    }
    public void addProduct(Product product){
        productsCollection.add(product);
    }
    public void totalCalculation() throws EmptySalesException {
        if (productsCollection.isEmpty()) {
            throw new EmptySalesException("To make a sale you must first make products.");
        } else {
            totalSalesPrice = 0;
            for (Product product : productsCollection) {
                totalSalesPrice += product.getPrice();
            }
        }
    }
}
