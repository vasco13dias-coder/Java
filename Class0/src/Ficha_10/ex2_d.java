 static void ex2d(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i * n + j + 1) + " ");
            }
            System.out.println();
        }
    }