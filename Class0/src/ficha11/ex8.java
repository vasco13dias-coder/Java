import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int lisboa = (int)(Math.random() * 20) + 1;
        int porto = (int)(Math.random() * 20) + 1;
        int santarem = (int)(Math.random() * 20) + 1;
        int faro = (int)(Math.random() * 20) + 1;

        int opcao;

        do {

            System.out.println("\n----- MENU -----");
            System.out.println("1 - Ver gráfico");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = teclado.nextInt();

            if (opcao == 1) {

                System.out.println("\nTemperaturas:");

                System.out.print("Lisboa (" + lisboa + "): ");
                for (int i = 0; i < lisboa; i++) {
                    System.out.print("*");
                }

                System.out.println();

                System.out.print("Porto (" + porto + "): ");
                for (int i = 0; i < porto; i++) {
                    System.out.print("*");
                }

                System.out.println();

                System.out.print("Santarém (" + santarem + "): ");
                for (int i = 0; i < santarem; i++) {
                    System.out.print("*");
                }

                System.out.println();

                System.out.print("Faro (" + faro + "): ");
                for (int i = 0; i < faro; i++) {
                    System.out.print("*");
                }

                System.out.println();
            }

        } while (opcao != 0);

        System.out.println("Programa terminado.");

        teclado.close();
    }
}