import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Choose an operation (addition(+), subtraction(-), multiplication(*) or division(/): ");
        String operation = scanner.next();
        
        if (operation.equals("+")) {
            double result = num1 + num2;
            System.out.println("The sum is: " + result);
        } else if (operation.equals("-")) {
            double result = num1 - num2;
            System.out.println("The difference is: " + result);
        } else if (operation.equals("*")) {
            double result = num1 * num2;
            System.out.println("The product is: " + result);
        } else if (operation.equals("/")) {
            if (num2 == 0) {
                System.out.println("Error: Divide by Zero");
            } else {
                double result = num1 / num2;
                System.out.println("The quotient is: " + result);
            }
        } else {
            System.out.println("Invalid operation selected.");
        }
        
        scanner.close();
    }
}