public import java.util.Scanner;

public class ex19 {
    static Scanner sc = new Scanner(System.in);

    static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();

        System.out.println("Números primos entre " + a + " e " + b + ":");
        for (int n = a; n <= b; n++) {
            if (ehPrimo(n)) {
                System.out.println(n);
            }
        }
    }
}