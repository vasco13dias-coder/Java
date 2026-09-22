public import java.util.Scanner;

public class ex11 {
    static Scanner sc = new Scanner(System.in);

    static void classificarTriangulo(double a, double b, double c) {
        if (a == b && b == c) {
            System.out.println("Equilátero");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }
    }

    public static void main(String[] args) {
        System.out.print("Lado A: ");
        double a = sc.nextDouble();
        System.out.print("Lado B: ");
        double b = sc.nextDouble();
        System.out.print("Lado C: ");
        double c = sc.nextDouble();
        classificarTriangulo(a, b, c);
    }
} {
    
}
