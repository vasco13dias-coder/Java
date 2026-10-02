import java.util.*;
public class Ex10 {
    static Scanner s = new Scanner(System.in);
    static int lerInt(String m) { System.out.print(m); return Integer.parseInt(s.nextLine()); }
    public static void main(String[] args) {
        String[][] sala = new String[6][5];
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 5; j++) sala[i][j] = " ";
        double total = 0;
        int op;
        do {
            System.out.println("1- Marca lugar\n2- Ver lugares Marcados\n3- Mostra total (Euros) efetuado\n0- Sair");
            op = lerInt("Opção = ");
            if (op == 1) {
                int f = lerInt("Fila (1-6): "), l = lerInt("Lugar (1-5): ");
                if (f < 1 || f > 6 || l < 1 || l > 5) System.out.println("Lugar inválido");
                else if (sala[f - 1][l - 1].equals("X")) System.out.println("Lugar ocupado");
                else { sala[f - 1][l - 1] = "X"; total += 5.00; }
            } else if (op == 2) {
                System.out.println("    1   2   3   4   5");
                for (int i = 0; i < 6; i++) {
                    System.out.print((i + 1) + " ");
                    for (int j = 0; j < 5; j++) System.out.print("| " + sala[i][j] + " ");
                    System.out.println("|");
                }
            } else if (op == 3) {
                System.out.println("Total: " + total + " €");
            }
        } while (op != 0);
    }
}