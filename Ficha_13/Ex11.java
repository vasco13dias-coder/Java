import java.util.*;
public class Ex11 {
    static Scanner s = new Scanner(System.in);
    static String[][] t = new String[3][3];

    static int lerInt(String m) { System.out.print(m); return Integer.parseInt(s.nextLine()); }

    static void desenharTabuleiro() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + t[i][0] + " | " + t[i][1] + " | " + t[i][2]);
            if (i < 2) System.out.println("---+---+---");
        }
    }

    static boolean verificarVencedor(String j) {
        for (int i = 0; i < 3; i++) {
            if (t[i][0].equals(j) && t[i][1].equals(j) && t[i][2].equals(j)) return true;
            if (t[0][i].equals(j) && t[1][i].equals(j) && t[2][i].equals(j)) return true;
        }
        return (t[0][0].equals(j) && t[1][1].equals(j) && t[2][2].equals(j))
            || (t[0][2].equals(j) && t[1][1].equals(j) && t[2][0].equals(j));
    }

    static boolean tabuleiroCheio() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (t[i][j].equals(" ")) return false;
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) t[i][j] = " ";
        String jog = "X";
        boolean fim = false;
        while (!fim) {
            desenharTabuleiro();
            System.out.println("Jogador " + jog);
            int l = lerInt("Linha (0-2): "), c = lerInt("Coluna (0-2): ");
            if (l < 0 || l > 2 || c < 0 || c > 2) { System.out.println("Fora dos limites"); continue; }
            if (!t[l][c].equals(" ")) { System.out.println("Posição ocupada"); continue; }
            t[l][c] = jog;
            if (verificarVencedor(jog)) {
                desenharTabuleiro();
                System.out.println("Venceu o jogador " + jog + "!");
                fim = true;
            } else if (tabuleiroCheio()) {
                desenharTabuleiro();
                System.out.println("Empate!");
                fim = true;
            } else jog = jog.equals("X") ? "O" : "X";
        }
    }
}