Factorial Using Loop
import java.util.Scanner;
public class LoopFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), f = 1;
        for(int i = 2; i <= n; i++) f *= i;
        System.out.println(f);
    }
}
