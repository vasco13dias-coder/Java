static void ex3l(int n) {
        for (int i = 0; i < n; i++) {
            for (int v = i + 1; v <= n; v++) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }