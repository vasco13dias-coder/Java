import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeroSecreto = (int)(Math.random() * 100) + 1;

        int tentativa;
        int contador = 0;

        do {

            System.out.print("Introduza um número de 1 a 100: ");
            tentativa = teclado.nextInt();

            contador++;

            if (tentativa > numeroSecreto) {
                System.out.println("Número introduzido é mais alto");

            } else if (tentativa < numeroSecreto) {
                System.out.println("Número introduzido é mais baixo");

            } else {
                System.out.println("Acertou em " + contador + " tentativas!");
            }

        } while (tentativa != numeroSecreto);

        teclado.close();
    }
}