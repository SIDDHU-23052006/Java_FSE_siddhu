import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        try {
            FileWriter fw = new FileWriter("output.txt");

            fw.write(str);

            fw.close();

            System.out.println("Data written successfully");
        }
        catch (IOException e) {
            System.out.println("File Error");
        }
    }
}