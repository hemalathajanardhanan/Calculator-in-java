import java.util.Scanner;
 
public class SimpleCalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
 
        System.out.print("Enter the type of operation you want to perform (+, -, *, /): ");
        String operation = sc.next();
        int result = performOperation(num1,num2, operation);
        System.out.println("Your answer is: " + result);
    }
 
    public static int performOperation( int num1,int num2, String operation)
    {
        int result = 0;
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        return result;
    }
}