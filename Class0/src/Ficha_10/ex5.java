static void ex5(int n) {
        int totalLinhas = 2 * n - 1;
        int largura = totalLinhas; // número de colunas
        int meio = n - 1;
        for (int r = 0; r < totalLinhas; r++) {
            int valor = (r <= meio) ? r + 1 : totalLinhas - r;
            int colEsquerda = valor - 1;
            int colDireita = largura - 1 - colEsquerda;
            StringBuilder sb = new StringBuilder();
            for (int c = 0; c < largura; c++) {
                if (c == colEsquerda || c == colDireita) {
                    sb.append(valor);
                } else {
                    sb.append(" ");
                }
                sb.append(" ");
            }
            System.out.println(sb);
        }
    }