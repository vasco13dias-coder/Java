package Ficha_9;

public class ex11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.print(i + "\t");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}