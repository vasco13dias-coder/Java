package Ficha_13;

import java.util.*;
public class Ex05 {
    static Scanner s = new Scanner(System.in);
    static int lerInt(String m) { System.out.print(m); return Integer.parseInt(s.nextLine()); }
    public static void main(String[] args) {
        int n = lerInt("Tamanho: ");
        int[] v = new int[n];
        for (int i = 0; i < n; i++) v[i] = lerInt("v[" + i + "]=");
        boolean cresc = true, decresc = true;
        for (int i = 0; i < n - 1; i++) {
            if (v[i] > v[i + 1]) cresc = false;
            if (v[i] < v[i + 1]) decresc = false;
        }
        if (cresc) System.out.println("Ordenado de forma crescente");
        else if (decresc) System.out.println("Ordenado de forma decrescente");
        else {
            int o = lerInt("Não está ordenado. 1-Crescente 2-Decrescente: ");
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - 1 - i; j++)
                    if ((o == 1 && v[j] > v[j + 1]) || (o == 2 && v[j] < v[j + 1])) {
                        int t = v[j]; v[j] = v[j + 1]; v[j + 1] = t;
                    }
            System.out.println(Arrays.toString(v));
        }
    }
}