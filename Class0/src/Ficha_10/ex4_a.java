static void ex4a(int n) {
        int largura = 2 * n;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                sb.append(j + 1).append(" ");
            }
            int espacos = (largura - 2 * (i + 1)) * 2;
            for (int e = 0; e < espacos; e++) {
                sb.append(" ");
            }
            for (int j = i; j >= 0; j--) {
                sb.append(j + 1).append(" ");
            }
            System.out.println(sb);
        }
    }