static void ex6d(int n) {
        for (int i = 0; i < n; i++) {
            for (int esp = 0; esp < n - 1 - i; esp++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }