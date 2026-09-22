static void ex4b(int n) {
        int totalLinhas = 2 * n - 1;
        for (int r = 0; r < totalLinhas; r++) {
            int altura = (r < n) ? r + 1 : totalLinhas - r;
            for (int j = 0; j < altura; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }