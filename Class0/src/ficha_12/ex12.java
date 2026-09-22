public import java.util.Scanner;

public class ex12 {
    static Scanner sc = new Scanner(System.in);

    static void classificarTriangulo(double ang1, double ang2, double ang3) {
        if (ang1 + ang2 + ang3 != 180) {
            System.out.println("Ângulos inválidos, a soma tem que ser 180º");
            return;
        }
        if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
            System.out.println("Retângulo");
        } else if (ang1 > 90 || ang2 > 90 || ang3 > 90) {
            System.out.println("Obtusângulo");
        } else {
            System.out.println("Acutângulo");
        }
    }

    public static void main(String[] args) {
        System.out.print("Ângulo 1: ");
        double a1 = sc.nextDouble();
        System.out.print("Ângulo 2: ");
        double a2 = sc.nextDouble();
        System.out.print("Ângulo 3: ");
        double a3 = sc.nextDouble();
        classificarTriangulo(a1, a2, a3);
    }
} {
    
}
