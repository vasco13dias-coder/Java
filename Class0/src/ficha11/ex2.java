import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduza x do centro: ");
        double x = teclado.nextDouble();

        System.out.print("Introduza y do centro: ");
        double y = teclado.nextDouble();

        System.out.print("Introduza o raio: ");
        double r = teclado.nextDouble();

        // Coordenadas aleatórias entre 0 e 20
        double x1 = Math.random() * 21;
        double y1 = Math.random() * 21;

        // Cálculo da distância
        double distancia = Math.sqrt(
                Math.pow(x1 - x, 2) +
                Math.pow(y1 - y, 2)
        );

        System.out.println("Ponto gerado: (" + x1 + ", " + y1 + ")");
        System.out.println("Distância ao centro: " + distancia);

        if (distancia <= r) {
            System.out.println("O ponto está dentro da circunferência.");
        } else {
            System.out.println("O ponto está fora da circunferência.");
        }

        teclado.close();
    }
}