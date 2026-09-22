static void ex3g(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }