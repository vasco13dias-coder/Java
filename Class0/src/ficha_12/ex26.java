public import java.util.Random;

public class ex26 {
    static Random rand = new Random();

    static int[] gerarNumeros(int quantidade, int max) {
        int[] numeros = new int[quantidade];
        int count = 0;

        while (count < quantidade) {
            int n = rand.nextInt(max) + 1;
            boolean repetido = false;
            for (int i = 0; i < count; i++) {
                if (numeros[i] == n) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                numeros[count] = n;
                count++;
            }
        }
        return numeros;
    }

    static void mostrarNumeros(int[] numeros, String titulo) {
        System.out.print(titulo + ": ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros = gerarNumeros(5, 50);
        int[] estrelas = gerarNumeros(2, 12);

        mostrarNumeros(numeros, "Números");
        mostrarNumeros(estrelas, "Estrelas");
    }
}