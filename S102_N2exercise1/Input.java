/*package S102_N2exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Input {
    private static Scanner sc = new Scanner(System.in);

    public static byte readByte(String message) {
        byte byteValue = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                byteValue = sc.nextByte();
                valid = true;

                System.out.println("Format error. Please enter a valid value.");
                sc.nextLine();
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
                intValue = sc.nextInt();
                valid = true;
            } catch (InputMismatchException error) {
                System.out.println("Format error. Please enter a valid value.");
                sc.nextLine();
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
                floatValue = sc.nextFloat();
                valid = true;

            } catch (InputMismatchException error) {
                System.out.println("Format error. Please enter a valid value.");
                sc.nextLine();
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
                doubleValue = sc.nextDouble();
                valid = true;
            } catch (InputMismatchException error) {
                System.out.println("Format error. Please enter a valid value.");
                sc.nextLine();
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
                charValue = sc.next().charAt(0);
                valid = true;
            } catch (Exception error) {
                System.out.println("Format error.Please enter a valid value.");
                sc.nextLine();
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
                sc.nextLine();
                stringValue = sc.nextLine().toLowerCase();
                valid = true;
            } catch (Exception error) {
                System.out.println("Format error. Please enter a valid text.");
            }
        }
        return stringValue;
    }
    public static boolean readYesNo(String message) {
        boolean booleanValue = false;
        boolean valid = false;
        String input = "";

        while (!valid) {
            try {
                System.out.println(message);
                input = sc.next().trim().toLowerCase();
                if (input.equals("y") || (input.equals("n"))) {
                    booleanValue = input.equals("y");
                    valid = true;
                } else {
                    booleanValue = false;
                    valid = false;
                }
            } catch (Exception error) {
                System.out.println("Format error. Please enter 'y' or 'n'.");
            } finally {
                sc.nextLine();
            }
        }
        return booleanValue;
    }
    public static void closeScanner(){
        sc.close();
    }
}*/