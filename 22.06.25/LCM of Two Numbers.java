import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), lcm = Math.max(a, b);
        while(true) {
            if(lcm % a == 0 && lcm % b == 0) break;
            lcm++;
        }
        System.out.println(lcm);
    }
}
