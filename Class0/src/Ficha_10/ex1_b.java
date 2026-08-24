package Ficha_10;Class0/src/Ficha_10/ex1_b.java
public class ex1_b {
    public static void main(String[] args) {
        int n = 4;

        for (int l = 1; l <= n; l++) {
            for (int c = 1; c <= n; c++) {
                if (c == n - 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}