import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Choose an operation (addition(+) or subtraction(-)): ");
        String operation = scanner.next();
        
        if (operation.equals("+")) {
            int result = num1 + num2;
            System.out.println("The sum is: " + result);
        } else if (operation.equals("-")) {
            int result = num1 - num2;
            System.out.println("The difference is: " + result);
        } else {
            System.out.println("Invalid operation selected.");
        }
        
        scanner.close();
    }
}