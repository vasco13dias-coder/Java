public import java.util.Scanner;

public class ex20 {
    static Scanner sc = new Scanner(System.in);

    static void tabuada(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        System.out.print("Número: ");
        int n = sc.nextInt();
        tabuada(n);
    }
} {
    
}
