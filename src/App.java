import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        while (true) {
            System.out.println("Temperature Converter");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextLine();

            switch (choice) {
                case "1":
                    convertCelToFah(input);
                    break;
                case "2":
                    convertFahToCel(input);
                    break;
                case "3":
                    System.out.println("Exiting the program.");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }

    private static void convertCelToFah(Scanner scanner) {
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = Valid(scanner);
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.1f°C is equal to %.1f°F%n", celsius, fahrenheit);
    }

    private static void convertFahToCel(Scanner scanner) {
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = Valid(scanner);
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%.1f°F is equal to %.1f°C%n", fahrenheit, celsius);
    }

    private static double Valid(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }
}
