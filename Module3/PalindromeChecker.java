import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String clean = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
                clean = clean + ch;
            }
            else if (ch >= 'a' && ch <= 'z') {
                clean = clean + ch;
            }
            else if (ch >= '0' && ch <= '9') {
                clean = clean + ch;
            }
        }

        String rev = "";

        for (int i = clean.length() - 1; i >= 0; i--) {
            rev = rev + clean.charAt(i);
        }

        if (clean.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}