import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<String>();

        System.out.print("How many names: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            names.add(name);
        }

        System.out.println("Student Names:");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}