public import java.util.Scanner;

public class ex8 {
    static Scanner sc = new Scanner(System.in);

    // Áreas dos terrenos (calculadas a partir da imagem da ficha)
    // TerrenosA: A-C-D-E-F-G | TerrenosB: B-C-D-H-I-J
    static double calcularArea(String terreno) {
        switch (terreno) {
            case "A": return 10 * 5;
            case "B": return 10 * 5;
            case "C": return 3 * 10;
            case "D": return 3 * 10;
            case "E": return 3 * 6;
            case "F": return 3 * 4;
            case "G": return 4 * 10;
            case "H": return 3 * 4;
            case "I": return 3 * 3;
            case "J": return 4 * 6;
            default: return 0;
        }
    }

    static double precoAleatorio() {
        return 100 + Math.random() * 100; // entre 100 e 200
    }

    static double calcularTotal(String[] terrenos) {
        double total = 0;
        for (String t : terrenos) {
            double area = calcularArea(t);
            double preco = precoAleatorio();
            double subtotal = area * preco;
            System.out.printf("Terreno %s -> Área: %.1f m² x %.2f €/m² = %.2f €%n", t, area, preco, subtotal);
            total += subtotal;
        }
        return total;
    }

    public static void main(String[] args) {
        String[] terrenosA = {"A", "C", "D", "E", "F", "G"};
        String[] terrenosB = {"B", "C", "D", "H", "I", "J"};

        System.out.println("--- Terrenos A ---");
        double totalA = calcularTotal(terrenosA);
        System.out.printf("Total A: %.2f €%n%n", totalA);

        System.out.println("--- Terrenos B ---");
        double totalB = calcularTotal(terrenosB);
        System.out.printf("Total B: %.2f €%n%n", totalB);

        if (totalA < totalB) {
            System.out.println("Opção mais barata: Terrenos A");
        } else if (totalB < totalA) {
            System.out.println("Opção mais barata: Terrenos B");
        } else {
            System.out.println("Os dois terrenos têm o mesmo preço");
        }
    }
} {
    
}
