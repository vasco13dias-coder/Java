public class Ex7 {
    public static void main(String[] args) {

        double soma = 0;

        for (int n = 0; n < 1000; n++) {

            if (n % 2 == 0) {
                soma += 1.0 / (2 * n + 1);
            } else {
                soma -= 1.0 / (2 * n + 1);
            }
        }

        double piObtido = soma * 4;
        double piEsperado = Math.PI;
        double desvio = Math.abs(piEsperado - piObtido);

        System.out.println("Valor esperado: " + piEsperado);
        System.out.println("Valor obtido:   " + piObtido);
        System.out.println("Desvio:         " + desvio);
    }
}