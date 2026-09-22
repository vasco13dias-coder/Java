public public class ex25 {

    static long fatorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    static long combinacao(int n, int p) {
        return fatorial(n) / (fatorial(p) * fatorial(n - p));
    }

    public static void main(String[] args) {
        long c50_5 = combinacao(50, 5);
        long c12_2 = combinacao(12, 2);
        long combinacaoTotal = c50_5 * c12_2;

        System.out.println("C(50,5) = " + c50_5);
        System.out.println("C(12,2) = " + c12_2);
        System.out.println("Combinação total do Euromilhões = " + combinacaoTotal);
    }
} {
    
}
