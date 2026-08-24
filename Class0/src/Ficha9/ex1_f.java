
package Ficha_9;
public class ex1_f {
    public static void main(String[] args) {
        for (int i = 80; i <= 120; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}