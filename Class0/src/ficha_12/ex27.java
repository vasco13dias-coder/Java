public import java.util.Scanner;

public class ex27 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int tentativa;
        int tentativas = 0;

        do {
            System.out.print("Introduza um número (1-100): ");
            tentativa = sc.nextInt();
            tentativas++;

            if (tentativa < numeroSecreto) {
                System.out.println("Número introduzido é mais baixo");
            } else if (tentativa > numeroSecreto) {
                System.out.println("Número introduzido é mais alto");
            } else {
                System.out.println("Acertou em " + tentativas + " tentativas");
            }
        } while (tentativa != numeroSecreto);
    }
} {
    
}
