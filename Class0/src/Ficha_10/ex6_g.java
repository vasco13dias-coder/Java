static void ex6g(int n) {
        int totalLinhas = 2 * n - 1;
        for (int r = 0; r < totalLinhas; r++) {
            int distMeio = Math.abs(r - (n - 1));
            int espacos = distMeio;
            int estrelas = 2 * (n - 1 - distMeio) + 1;
            for (int e = 0; e < espacos; e++) {
                System.out.print("  ");
            }
            for (int j = 0; j < estrelas; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }