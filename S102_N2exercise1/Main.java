package s102_Exceptions.S102_N2exercise1;

public class Main {
    public static void main(String[] args) {

        byte date;
        int phoneNumber;
        float sugarPrice;
        double piNumber;
        char countryInitial;
        String city;
        boolean rain;

        date =Input.readByte("Today's date is: ");
        System.out.println("Date: " + date + ".");

        phoneNumber = Input.readInt("What's your phone number?");
        System.out.println("Phone number: " + phoneNumber + ".");

        sugarPrice = Input.readFloat("What's the sugar price?");
        System.out.println("Sugar's price: " + sugarPrice + ".");

        piNumber = Input.readDouble("Enter the Pi number: ");
        System.out.println("Pi number: " + piNumber + ".");

        countryInitial = Input.readChar("Enter your country's initial: ");
        System.out.println("Country's initial: " + countryInitial + ".");

        city = Input.readString("Name of a city:");
        System.out.println("City's name: " + city + ".");

        rain = Input.readYesNo("Has it rained today? Enter 'y' or 'n'.");
        System.out.println("Answer: " + rain + ".");

    }
}
