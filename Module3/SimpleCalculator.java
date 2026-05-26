import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the operation ('+' '-' '*' '/'):");
        String op = sc.next();
        switch(op) {
            case "+":
                System.out.println("The addition of numbers is: " +(num1 + num2));
                break;
            case "-":
                System.out.println("The subtraction of numbers is: "+(num1 - num2));
                break;
            case "*":
                System.out.println("The multiplication of numbers is: "+(num1 * num2));
                break;
            case "/":
                float ans = num1 / num2;
                System.out.printf("The division of numbers is: %.2f", ans);
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }
    }
}
