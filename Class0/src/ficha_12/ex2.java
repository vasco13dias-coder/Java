public import java.util.Scanner;

public class ex2 {
    static Scanner sc = new Scanner(System.in);

    static void calcularVoltagem(double i, double r) {
        System.out.println("V = " + (i * r));
    }

    static void calcularIntensidade(double v, double r) {
        System.out.println("I = " + (v / r));
    }

    static void calcularResistencia(double v, double i) {
        System.out.println("R = " + (v / i));
    }

    public static void main(String[] args) {
        System.out.print("Intensidade: ");
        double i = sc.nextDouble();
        System.out.print("Resistência: ");
        double r = sc.nextDouble();
        calcularVoltagem(i, r);

        System.out.print("Voltagem: ");
        double v = sc.nextDouble();
        System.out.print("Resistência: ");
        r = sc.nextDouble();
        calcularIntensidade(v, r);

        System.out.print("Voltagem: ");
        v = sc.nextDouble();
        System.out.print("Intensidade: ");
        i = sc.nextDouble();
        calcularResistencia(v, i);
    }
}