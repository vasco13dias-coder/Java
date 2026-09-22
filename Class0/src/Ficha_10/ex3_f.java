static void ex3f(int n) {
        for (int i = 0; i < n; i++) {
            int quantos = n - i;
            for (int j = 0; j < quantos; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }