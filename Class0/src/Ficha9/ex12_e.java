package Ficha_9;

public class ex12_e {
    public static void main(String[] args) {
        char[] letras = {'a', 'b', 'c'};

        for (int l = 0; l < letras.length; l++) {
            for (int i = 1; i <= 4; i++) {
                System.out.print(letras[l]);
            }
            System.out.print(" ");
        }
    }
}