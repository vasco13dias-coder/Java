public import java.util.Scanner;

public class ex17 {
    static Scanner sc = new Scanner(System.in);

    static int somarIntervalo(int a, int b) {
        int soma = 0;
        for (int n = a; n <= b; n++) {
            soma += n;
        }
        return soma;
    }

    public static void main(String[] args) {
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.println("Soma = " + somarIntervalo(a, b));
    }
} {
    
}
