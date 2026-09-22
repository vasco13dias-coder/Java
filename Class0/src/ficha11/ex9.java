import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escolha um número entre 1 e 100: ");
        int numeroEscolhido = teclado.nextInt();

        int minimo = 1;
        int maximo = 100;

        int tentativa;
        int resposta;

        do {

            tentativa = (minimo + maximo) / 2;

            System.out.println("\nO computador tenta: " + tentativa);

            System.out.println("1 - Acertou");
            System.out.println("2 - O número é maior");
            System.out.println("3 - O número é menor");
            System.out.print("Resposta: ");

            resposta = teclado.nextInt();

            if (resposta == 2) {
                minimo = tentativa + 1;

            } else if (resposta == 3) {
                maximo = tentativa - 1;
            }

        } while (resposta != 1);

        System.out.println("O computador acertou!");

        teclado.close();
    }
}