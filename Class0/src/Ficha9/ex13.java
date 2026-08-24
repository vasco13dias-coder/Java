package Ficha_9;

public class ex13 {
    public static void main(String[] args) {
        System.out.print("   |");
        for (int j = 1; j <= 10; j++) {
            System.out.printf("%4d", j);
        }
        System.out.println();

        System.out.print("---+");
        for (int j = 1; j <= 10; j++) {
            System.out.print("----");
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}