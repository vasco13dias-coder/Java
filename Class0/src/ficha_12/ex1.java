public import java.util.Scanner;

public class ex1 {
    static double v, r, i;
    static Scanner sc = new Scanner(System.in);

    static void calcularVoltagem() {
        System.out.print("Intensidade (I): ");
        i = sc.nextDouble();
        System.out.print("Resistência (R): ");
        r = sc.nextDouble();
        v = i * r;
        System.out.println("V = " + v);
    }

    static void calcularIntensidade() {
        System.out.print("Voltagem (V): ");
        v = sc.nextDouble();
        System.out.print("Resistência (R): ");
        r = sc.nextDouble();
        i = v / r;
        System.out.println("I = " + i);
    }

    static void calcularResistencia() {
        System.out.print("Voltagem (V): ");
        v = sc.nextDouble();
        System.out.print("Intensidade (I): ");
        i = sc.nextDouble();
        r = v / i;
        System.out.println("R = " + r);
    }

    public static void main(String[] args) {
        calcularVoltagem();
        calcularIntensidade();
        calcularResistencia();
    }
}