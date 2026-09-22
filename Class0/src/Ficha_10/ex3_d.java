static void ex3d(int n) {
        for (int i = 0; i < n; i++) {
            int valor = n - i;
            int quantos = i + 1;
            for (int j = 0; j < quantos; j++) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }