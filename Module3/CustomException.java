import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("Age is less than 18");
            }

            System.out.println("Valid Age");
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}