public import java.util.Scanner;

public class ex22 {
    static Scanner sc = new Scanner(System.in);

    static long fatorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.print("Número (1-20): ");
        int n = sc.nextInt();
        System.out.println(n + "! = " + fatorial(n));
    }
} {
    
}
