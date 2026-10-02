package Ficha_13;

import java.util.*;
public class Ex02 {
    static Scanner s = new Scanner(System.in);
    static int lerInt(String m) { System.out.print(m); return Integer.parseInt(s.nextLine()); }
    static String lerTxt(String m) { System.out.print(m); return s.nextLine(); }
    public static void main(String[] args) {
        String[] nome = new String[10], loc = new String[10];
        int[] idade = new int[10];
        int n = 0, op;
        do {
            System.out.println("1-Inserir novo cliente\n2-Mostrar cliente x\n3-Mostrar todos os clientes\n0-Sair");
            op = lerInt("Opção = ");
            if (op == 1) {
                if (n == 10) System.out.println("Array cheio");
                else {
                    nome[n] = lerTxt("Nome: ");
                    idade[n] = lerInt("Idade: ");
                    loc[n] = lerTxt("Localidade: ");
                    n++;
                }
            } else if (op == 2) {
                int x = lerInt("Cliente nº (0-" + (n - 1) + "): ");
                if (x >= 0 && x < n) System.out.println(nome[x] + ", " + idade[x] + " anos, " + loc[x]);
                else System.out.println("Cliente inexistente");
            } else if (op == 3) {
                for (int i = 0; i < n; i++)
                    System.out.println(i + " - " + nome[i] + ", " + idade[i] + " anos, " + loc[i]);
            }
        } while (op != 0);
    }
}