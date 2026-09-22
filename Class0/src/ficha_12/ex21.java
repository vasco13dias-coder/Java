public import java.util.Scanner;

public class ex21 {
    static Scanner sc = new Scanner(System.in);

    static long calcularPotencia(int base, int expoente) {
        long resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.print("Base: ");
        int base = sc.nextInt();
        System.out.print("Expoente: ");
        int expoente = sc.nextInt();

        System.out.println(base + "^" + expoente + " = " + calcularPotencia(base, expoente));
    }
}  {
    
}
