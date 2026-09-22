static void ex3c(int n) {
        for (int i = 0; i < n; i++) {
            int valor = i + 1;
            int quantos = n - i;
            for (int j = 0; j < quantos; j++) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }