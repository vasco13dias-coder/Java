static void ex4c(int n) {
        int totalLinhas = 2 * n - 1;
        for (int r = 0; r < totalLinhas; r++) {
            int largura = (r < n) ? 2 * r + 1 : 2 * (totalLinhas - 1 - r) + 1;
            for (int j = 0; j < largura; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }