static void ex6h(int n) {
        int totalLinhas = 2 * n - 1;
        for (int r = 0; r < totalLinhas; r++) {
            int distMeio = Math.abs(r - (n - 1));
            int estrelas = 2 * (n - 1 - distMeio) + 1;
            for (int j = 0; j < estrelas; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }