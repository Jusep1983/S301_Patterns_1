package level1.utilsIO;

import level1.exceptions.EmptyInputException;
import level1.exceptions.ValueOutOfRangeException;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class KeyboardInput {
    private static final Scanner SC = new Scanner(System.in);

    public static void numberNotEmpty(String input) throws EmptyInputException {
        if (input.isEmpty()) {
            throw new EmptyInputException("the field cannot be empty.");
        }
    }

    public static String readInput() {
        return SC.nextLine().trim();
    }

    public static String checkString() throws EmptyInputException {
        String inputStr = readInput();
        if (inputStr.isEmpty()) {
            throw new EmptyInputException("the field cannot be empty.");
        } else {
            return inputStr;
        }
    }

    public static String readString(String message) {
        while (true) {
            try {
                System.out.print(message);
                return checkString();
            } catch (EmptyInputException | NoSuchElementException | IllegalStateException e) {
                System.err.println("Error, " + e.getMessage());
            }
        }
    }

    public static void checkRangeNumber(String input, int minimum, int maximum) throws ValueOutOfRangeException {
        int number = Integer.parseInt(input);
        if (number < minimum || number > maximum) {
            throw new ValueOutOfRangeException(
                    "the value must be between " + minimum + " and " + maximum + ". "
            );
        }
    }

    public static int readIntegerBetweenOnRange(String message, int minimum, int maximum) {
        while (true) {
            try {
                System.out.print(message);
                String input = readInput();
                numberNotEmpty(input);
                checkRangeNumber(input, minimum, maximum);
                return Integer.parseInt(input);
            } catch (NullPointerException | NumberFormatException e) {
                System.err.println("Format error.");
            } catch (EmptyInputException | NoSuchElementException | IllegalStateException |
                     ValueOutOfRangeException e) {
                System.err.println("Error, " + e.getMessage());
            }
        }
    }

    public static int menuOption() {
        return readIntegerBetweenOnRange(""" 
                
                MAIN MENU
                 1.- Add command
                 2.- Delete last command
                 3.- Show command history
                 0.- Exit
                Select an option (0 to 3):
                """, 0, 3);
    }
}
