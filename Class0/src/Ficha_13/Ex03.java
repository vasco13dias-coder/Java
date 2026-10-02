package Ficha_13;

import java.util.*;
public class Ex03 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int[] v = new int[10];
        for (int i = 0; i < v.length; i++) {
            System.out.print("v[" + i + "]=");
            v[i] = Integer.parseInt(s.nextLine());
        }
        int max = v[0], min = v[0], soma = 0;
        for (int x : v) {
            if (x > max) max = x;
            if (x < min) min = x;
            soma += x;
        }
        System.out.println("Maior: " + max);
        System.out.println("Menor: " + min);
        System.out.println("Média: " + (double) soma / v.length);
    }
}