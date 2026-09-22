public class Ex4 {

    public static long fatorial(int n) {

        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static long combinacao(int n, int p) {

        return fatorial(n) /
               (fatorial(p) * fatorial(n - p));
    }

    public static void main(String[] args) {

        long combinacoesNumeros = combinacao(50, 5);
        long combinacoesEstrelas = combinacao(12, 2);

        long total = combinacoesNumeros * combinacoesEstrelas;

        System.out.println("Combinações de números: " + combinacoesNumeros);
        System.out.println("Combinações de estrelas: " + combinacoesEstrelas);
        System.out.println("Total de combinações: " + total);
    }
}