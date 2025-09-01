import java.util.Scanner;
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String userInput = scanner.nextLine();

        try {
            // Parsing user input to an integer
            int number = parseInt(userInput);

            // Dividing by the user-provided number
            int result = 100 / number;

            // Printing the result
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            // Catching exception if the user input is not a valid integer
            System.err.println("NumberFormatException: " + e.getMessage());
        } catch (ArithmeticException e) {
            // Catching exception if there is an arithmetic error (e.g., division by zero)
            System.err.println("ArithmeticException: " + e.getMessage());
        } finally {
            // The code in the finally block always gets executed, regardless of whether an exception occurred or not
            System.out.println("Finally block executed");
        }

        // Closing the scanner
        scanner.close();
    }

    // Method that throws an exception using the 'throws' keyword
    private static int parseInt(String input) throws NumberFormatException {
        // Parsing the string to an integer
        return Integer.parseInt(input);
    }  
}
