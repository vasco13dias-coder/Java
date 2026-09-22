public import java.util.Scanner;

public class ex4_5_6 {
    static Scanner sc = new Scanner(System.in);

    static int pedirNumInt(String s) {
        System.out.print(s);
        return sc.nextInt();
    }

    static double pedirNumDouble(String s) {
        System.out.print(s);
        return sc.nextDouble();
    }

    static String pedirString(String s) {
        System.out.print(s);
        return sc.next();
    }

    public static void main(String[] args) {
        int n = pedirNumInt("Introduza um número inteiro: ");
        double d = pedirNumDouble("Introduza um número double: ");
        String txt = pedirString("Introduza uma String: ");

        System.out.println("Inteiro: " + n);
        System.out.println("Double: " + d);
        System.out.println("String: " + txt);
    }
} {
    
}
