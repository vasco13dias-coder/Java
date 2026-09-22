public import java.util.Scanner;

public class ex23 {
    static Scanner sc = new Scanner(System.in);

    static void patternA(int n) {
        for (int linha = 0; linha < n; linha++) {
            for (int col = 0; col < n; col++) {
                System.out.print(linha + " ");
            }
            System.out.println();
        }
    }

    static void patternB(int n) {
        for (int linha = 0; linha < n; linha++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("n: ");
        int n = sc.nextInt();

        System.out.println("Pattern a)");
        patternA(n);

        System.out.println("\nPattern b)");
        patternB(n);
    }
} {
    
}
