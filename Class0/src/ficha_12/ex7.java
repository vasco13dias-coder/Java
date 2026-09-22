public import java.util.Scanner;

public class ex7 {
    static Scanner sc = new Scanner(System.in);

    static void multiplos(int x, int a, int b) {
        System.out.println("Múltiplos de " + x + " entre " + a + " e " + b + ":");
        for (int n = a; n <= b; n++) {
            if (n % x == 0) {
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        multiplos(x, a, b);
    }
} {
    
}
