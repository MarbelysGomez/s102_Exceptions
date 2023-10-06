package S102_N1exercise1;

public class Product_Sale {
    public static void main(String[] args) {
        try {
            Product product1 = new Product("Mouse pad", 15.5);
            Product product2 = new Product("Keyboard", 70.9);
            Product product3 = new Product("Pendrive", 25.5);

            Sale saleObj = new Sale();

            saleObj.addProduct(product1);
            saleObj.addProduct(product2);
            saleObj.addProduct(product3);

            saleObj.totalCalculation();

            System.out.println("The total sales price is: " + saleObj.getTotalSalesPrice() + ".");

            int index = 5;

            Product product = saleObj.getProductsCollection().get(index);
            System.out.println("Product at index " + index + ": " + product.getName() + "-" + product.getPrice());

        } catch (EmptySalesException e) {
            System.out.println(e.getMessage());
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
