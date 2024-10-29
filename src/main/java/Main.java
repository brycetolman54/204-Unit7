import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator!");

        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        String input = "";
        String command = "";
        int num1 = 0;
        int num2 = 0;

        while(!command.equals("quit")) {

            switch (command) {
                case "add":
                    System.out.println(calc.add(num1, num2));
                    break;
                case "subtract":
                    System.out.println(calc.subtract(num1, num2));
                    break;
                case "multiply":
                    System.out.println(calc.multiply(num1, num2));
                    break;
                case "divide":
                    System.out.println(calc.divide(num1, num2));
                    break;
                case "fibonacci":
                    System.out.println(calc.fibonacciNumberFinder(num1));
                    break;
                case "binary":
                    System.out.println(calc.intToBinaryNumber(num1));
                    break;
            }

            System.out.println("Enter a command: ");
            input = scanner.nextLine();
            String[] arguments = input.split("\\s+");
            command = arguments.length > 0 ? arguments[0] : "";
            num1 = arguments.length > 1 ? Integer.parseInt(arguments[1]) : 0;
            num2 = arguments.length > 2 ? Integer.parseInt(arguments[2]) : 0;

        }
    }
}
