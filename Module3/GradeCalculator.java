import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks out of 100 : ");
        int marks = sc.nextInt();
        if(marks <=100 && marks >=90){
            System.out.println("You got grade 'A'");
        }
        else if(marks <= 89 && marks >= 80) {
            System.out.println("You got grade 'B'");
        }
        else if(marks <= 79 && marks >= 70) {
            System.out.println("You got grade 'C'");
        }
        else if(marks <= 69 && marks >= 60) {
            System.out.println("You got grade 'D'");
        }
        else if(marks <=59) {
            System.out.println("Sorry!! you got 'F'");
        }
        else {
            System.out.println("Please enter a valid mark");
        }
    }
}
