import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer : ");
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println("The given integer is Even!");
        }
        else {
            System.out.println("The given integer is Odd!");
        }
    }
}
