public import java.util.Scanner;

public class ex3 {
    static Scanner sc = new Scanner(System.in);

    static double calcularVoltagem(double i, double r) {
        return i * r;
    }

    static double calcularIntensidade(double v, double r) {
        return v / r;
    }

    static double calcularResistencia(double v, double i) {
        return v / i;
    }

    public static void main(String[] args) {
        System.out.print("Intensidade: ");
        double i = sc.nextDouble();
        System.out.print("Resistência: ");
        double r = sc.nextDouble();
        System.out.println("V = " + calcularVoltagem(i, r));

        System.out.print("Voltagem: ");
        double v = sc.nextDouble();
        System.out.print("Resistência: ");
        r = sc.nextDouble();
        System.out.println("I = " + calcularIntensidade(v, r));

        System.out.print("Voltagem: ");
        v = sc.nextDouble();
        System.out.print("Intensidade: ");
        i = sc.nextDouble();
        System.out.println("R = " + calcularResistencia(v, i));
    }
}