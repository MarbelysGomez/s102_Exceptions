package s102_Exceptions.S102_N2exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Input {
    private static Scanner inputSc = new Scanner(System.in);

    public static byte readByte(String message) {
        byte byteValue = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                byteValue = inputSc.nextByte();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid date.");
                inputSc.nextLine();
            }
        }
        return byteValue;
    }
    public static int readInt(String message) {
        int intValue = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                intValue = inputSc.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter your phone number.");
                inputSc.nextLine();
            }
        }
        return intValue;
    }
    public static float readFloat(String message) {
        float floatValue = 0f;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                floatValue = inputSc.nextFloat();
                valid = true;

            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid price value.");
                inputSc.nextLine();
            }
        }
        return floatValue;
    }
    public static double readDouble(String message) {
        double doubleValue = 0d;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                doubleValue = inputSc.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid Pi value.");
                inputSc.nextLine();
            }
        }
        return doubleValue;
    }
    public static char readChar(String message) {
        char charValue = '0';
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                charValue = inputSc.next().charAt(0);
                valid = true;
            } catch (Exception e) {
                System.out.println("Format error.Please enter a valid country's initial.");
                inputSc.nextLine();
            }
        }
        return charValue;
    }
    public static String readString(String message) {
        String stringValue = "";
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                inputSc.nextLine();
                stringValue = inputSc.nextLine().toLowerCase();
                valid = true;
            } catch (Exception e) {
                System.out.println("Format error. Please enter a valid name of a city.");
            }
        }
        return stringValue;
    }
    public static boolean readYesNo(String message) {
        boolean booleanValue = false;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                String input = inputSc.next();
                if (input.equalsIgnoreCase("y")) {
                    booleanValue = true;
                    valid = true;
                } else if (input.equalsIgnoreCase("n")){
                    booleanValue = false;
                    valid = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Format error. Please enter 'y' or 'n'.");
                inputSc.nextLine();
            }
        }
        return booleanValue;
    }
}