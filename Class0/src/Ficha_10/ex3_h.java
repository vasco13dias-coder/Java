static void ex3h(int n) {
        for (int i = 0; i < n; i++) {
            int quantos = n - i;
            for (int j = quantos; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }