static void ex6k() {
        for (int repeticao = 0; repeticao < 3; repeticao++) {
            for (int i = 1; i <= 3; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}