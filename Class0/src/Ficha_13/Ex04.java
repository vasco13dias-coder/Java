package Ficha_13;

import java.util.*;
public class Ex04 {
    static Scanner s = new Scanner(System.in);
    static String[] nome = new String[20];
    static int[] idade = new int[20], vezes = new int[20], total = new int[20];
    static int n = 0, premio = 250;

    static int lerInt(String m) { System.out.print(m); return Integer.parseInt(s.nextLine()); }

    static int[] indices() {
        int[] o = new int[n];
        for (int i = 0; i < n; i++) o[i] = i;
        return o;
    }

    static void listar(int[] ord) {
        for (int k = 0; k < ord.length; k++) {
            int i = ord[k];
            System.out.println(nome[i] + ", de " + idade[i] + " anos, ganhou " + vezes[i]
                    + " prémios, no total de " + total[i] + " euros");
        }
    }

    public static void main(String[] args) {
        int op;
        do {
            System.out.println("Menu\n1 - Inscrições\n2 - Sorteio\n3 - Listagem\n4 - Quem ganhou mais vezes\n"
                    + "5 - Alterar valor do prémio\n6 - Quanto já foi dado em prémios\n"
                    + "7 - Listagem ordenada por nomes (crescente)\n"
                    + "8 - Listagem ordenada pelo nº de prémios ganhos (decrescente)\n0 - Sair");
            op = lerInt("Opção = ");
            switch (op) {
                case 1: {
                    if (n == 20) { System.out.println("Concurso cheio"); break; }
                    System.out.print("Nome: ");
                    String nm = s.nextLine();
                    int id = lerInt("Idade: ");
                    if (id < 18) System.out.println("Idade mínima: 18 anos");
                    else { nome[n] = nm; idade[n] = id; n++; }
                    break;
                }
                case 2: {
                    if (n == 0) System.out.println("Sem inscritos");
                    else {
                        int r = (int) (Math.random() * n);
                        vezes[r]++;
                        total[r] += premio;
                        System.out.println(nome[r] + " ganhou " + premio + " euros");
                    }
                    break;
                }
                case 3: listar(indices()); break;
                case 4: {
                    int max = 0;
                    for (int i = 0; i < n; i++) max = Math.max(max, vezes[i]);
                    if (max == 0) System.out.println("Ainda ninguém ganhou");
                    else for (int i = 0; i < n; i++)
                        if (vezes[i] == max) System.out.println(nome[i] + " (" + max + " vezes)");
                    break;
                }
                case 5: premio = lerInt("Novo valor do prémio: "); break;
                case 6: {
                    int t = 0;
                    for (int i = 0; i < n; i++) t += total[i];
                    System.out.println("Total dado em prémios: " + t + " euros");
                    break;
                }
                case 7:
                case 8: {
                    int[] o = indices();
                    for (int i = 0; i < n - 1; i++)
                        for (int j = 0; j < n - 1 - i; j++) {
                            boolean troca = (op == 7)
                                    ? nome[o[j]].compareToIgnoreCase(nome[o[j + 1]]) > 0
                                    : vezes[o[j]] < vezes[o[j + 1]];
                            if (troca) { int t = o[j]; o[j] = o[j + 1]; o[j + 1] = t; }
                        }
                    listar(o);
                    break;
                }
            }
        } while (op != 0);
    }
}