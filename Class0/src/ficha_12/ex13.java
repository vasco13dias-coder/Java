public import java.util.Scanner;

public class ex13 {
    static Scanner sc = new Scanner(System.in);

    static void verificarDivisibilidade(int n) {
        if (n % 10 == 0) {
            System.out.println(n + " é divisível por 10");
        } else if (n % 5 == 0) {
            System.out.println(n + " é divisível por 5");
        } else if (n % 2 == 0) {
            System.out.println(n + " é divisível por 2");
        } else {
            System.out.println(n + " não é divisível por 10, 5 ou 2");
        }
    }

    public static void main(String[] args) {
        System.out.print("Introduza um número: ");
        int n = sc.nextInt();
        verificarDivisibilidade(n);
    }
}