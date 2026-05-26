import java.util.*;

public class Fibonacii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("0 1 ");
        System.out.print(fibo(num, 0 , 1));
    }
    static int fibo(int num, int f, int s) {
        if(num < 0) {
            System.out.println();
            return 0;
        }
        int res = f + s;
        System.out.print(res+" ");
        num-=1;
        return fibo(num,s,res);
    }
}
