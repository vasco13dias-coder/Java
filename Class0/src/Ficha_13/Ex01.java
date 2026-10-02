package Ficha_13;

import java.util.*;
public class Ex01 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        String[] nome = new String[3];
        int[] idade = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Nome [" + i + "]: ");
            nome[i] = s.nextLine();
            System.out.print("Idade [" + i + "]: ");
            idade[i] = Integer.parseInt(s.nextLine());
        }
        for (int i = 0; i < 3; i++)
            System.out.println(nome[i] + ", " + idade[i] + " anos");
    }
}