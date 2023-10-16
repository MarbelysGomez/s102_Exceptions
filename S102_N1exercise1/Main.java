package s102_Exceptions.S102_N1exercise1;

public class Main {
    public static void main(String[] args) {

        Sale saleObj = new Sale();
        try {
           saleObj.totalCalculation();
        } catch (EmptySalesException e) {
            System.out.println(e.getMessage());
        }
        try {
            int [] arrayObj = new int[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e);
        }
    }
}

