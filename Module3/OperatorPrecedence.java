import java.util.*;

public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.printf("BODMAS rule\n\nB - Brackets (resolve operations inside parentheses, curly braces, or square brackets first)\nO - Orders or \"Of\" (evaluate powers, exponents, or square roots)\nD - Division\nM - Multiplication\nA - Addition\nS - Subtraction\n\n");
        System.out.print("(100 / 50) * 10 + 5 * 2 / 2 - 1 = ");
        int result = (100 / 50) * 10 + 5 * 2 / 2 - 1;
        System.out.print(result);
    }
}
