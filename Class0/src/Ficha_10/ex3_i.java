static void ex3i(int n) {
        for (int i = 0; i < n; i++) {
            for (int v = n; v >= n - i; v--) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }