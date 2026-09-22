public class Ex5 {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        int[] estrelas = new int[2];

        // Gerar 5 números sem repetição
        for (int i = 0; i < 5; i++) {

            int numero;

            do {
                numero = (int)(Math.random() * 50) + 1;
            } while (existe(numeros, numero, i));

            numeros[i] = numero;
        }

        // Gerar 2 estrelas sem repetição
        for (int i = 0; i < 2; i++) {

            int estrela;

            do {
                estrela = (int)(Math.random() * 12) + 1;
            } while (existe(estrelas, estrela, i));

            estrelas[i] = estrela;
        }

        System.out.print("Números: ");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.print("\nEstrelas: ");

        for (int estrela : estrelas) {
            System.out.print(estrela + " ");
        }
    }

    public static boolean existe(int[] vetor, int numero, int quantidade) {

        for (int i = 0; i < quantidade; i++) {

            if (vetor[i] == numero) {
                return true;
            }
        }

        return false;
    }
}