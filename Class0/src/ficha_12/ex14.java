public import java.util.Scanner;

public class ex14 {
    static Scanner sc = new Scanner(System.in);

    static double menor(double a, double b, double c, double d) {
        double menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;
        if (d < menor) menor = d;
        return menor;
    }

    public static void main(String[] args) {
        System.out.print("Número 1: ");
        double a = sc.nextDouble();
        System.out.print("Número 2: ");
        double b = sc.nextDouble();
        System.out.print("Número 3: ");
        double c = sc.nextDouble();
        System.out.print("Número 4: ");
        double d = sc.nextDouble();

        System.out.println("O menor número é: " + menor(a, b, c, d));
    }
}