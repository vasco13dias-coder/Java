static void ex6f(int n) {
        for (int i = 0; i < n; i++) {
            for (int esp = 0; esp < i; esp++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }