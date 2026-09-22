import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduza um número entre 1 e 20: ");
        int numero = teclado.nextInt();

        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.println(numero + "! = " + fatorial);

        teclado.close();
    }
}