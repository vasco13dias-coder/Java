public import java.util.Scanner;

public class ex15 {
    static Scanner sc = new Scanner(System.in);

    static double converter(double euros, int opcao) {
        switch (opcao) {
            case 1: return euros * 1.09; // Dólares
            case 2: return euros * 0.86; // Libras
            case 3: return euros * 7.83; // Yuan
            case 4: return euros * 0.94; // Franco Suíço
            default: return -1;
        }
    }

    public static void main(String[] args) {
        System.out.print("Valor em euros: ");
        double euros = sc.nextDouble();

        System.out.println("1 - Dólares (USA)");
        System.out.println("2 - Libras (UK)");
        System.out.println("3 - Yuan (China)");
        System.out.println("4 - Franco Suíço");
        System.out.print("Escolha a opção: ");
        int opcao = sc.nextInt();

        double resultado = converter(euros, opcao);
        if (resultado == -1) {
            System.out.println("Opção inválida");
        } else {
            System.out.println("Valor convertido: " + resultado);
        }
    }
} {
    
}
