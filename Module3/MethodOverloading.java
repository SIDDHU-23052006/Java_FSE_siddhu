import java.util.*;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer : ");
        int num = sc.nextInt();
        System.out.print("Enter the Integer : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Integer : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the double : ");
        double num3 = sc.nextDouble();
        System.out.println("Enter the double : ");
        double num4 = sc.nextDouble();
        System.out.println("add(int num1, int num2) --------------->"+add(num,num1));
        System.out.println("add(int num1, int num2, int num3) ----->"+add(num,num1,num2));
        System.out.println("add(double num1, double num2) --------->"+add(num3, num4));
    }
    static int add(int num1, int num2) {
        return num1 + num2;
    }
    static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    static double add(double num1, double num2) {
        return num1 + num2;
    }
}
