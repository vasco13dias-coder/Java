public import java.util.Scanner;

public class ex18 {
    static Scanner sc = new Scanner(System.in);

    static void mostrarMultiplos(int n, int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        mostrarMultiplos(n, a, b);
    }
} {
    
}
