public import java.util.Scanner;

public class ex24 {
    static Scanner sc = new Scanner(System.in);

    static int gerarAleatorio(int a, int b) {
        return a + (int) (Math.random() * (b - a + 1));
    }

    public static void main(String[] args) {
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();

        System.out.println("Número aleatório: " + gerarAleatorio(a, b));
    }
} {
    
}
