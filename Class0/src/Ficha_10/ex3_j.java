static void ex3j(int n) {
        for (int i = 0; i < n; i++) {
            for (int v = n - i; v <= n; v++) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }