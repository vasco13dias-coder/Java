public import java.util.Scanner;

public class ex9 {
    static Scanner sc = new Scanner(System.in);

    static void verificarMultiplos(int a, int b) {
        if (a % b == 0) {
            System.out.println(a + " é múltiplo de " + b);
        } else if (b % a == 0) {
            System.out.println(b + " é múltiplo de " + a);
        } else {
            System.out.println("Nenhum é múltiplo do outro");
        }
    }

    public static void main(String[] args) {
        System.out.print("Número A: ");
        int a = sc.nextInt();
        System.out.print("Número B: ");
        int b = sc.nextInt();
        verificarMultiplos(a, b);
    }
} {
    
}
