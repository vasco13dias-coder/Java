public import java.util.Scanner;

public class ex10 {
    static Scanner sc = new Scanner(System.in);

    static boolean ehPar(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.print("Introduza um número: ");
        int n = sc.nextInt();
        if (ehPar(n)) {
            System.out.println(n + " é par");
        } else {
            System.out.println(n + " é ímpar");
        }
    }
} {
    
}
