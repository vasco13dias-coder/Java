package Ficha7;
import javax.swing.JOptionPane;
public class Ex4 {
public static void main(String[] args) {
    String menu = "Escolha o sólido:\n" +
                  "1 - Cubo\n" +
                  "2 - Prisma retangular\n" +
                  "3 - Esfera\n" +
                  "4 - Cilindro\n" +
                  "5 - Cone\n" +
                  "6 - Pirâmide";

    int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

    double volume;
    double s, l, w, h, r;

    switch (opcao) {
        case 1:
            s = Double.parseDouble(JOptionPane.showInputDialog("Lado do cubo (s):"));
            volume = Math.pow(s, 3);
            break;
        case 2:
            l = Double.parseDouble(JOptionPane.showInputDialog("Comprimento (l):"));
            w = Double.parseDouble(JOptionPane.showInputDialog("Largura (w):"));
            h = Double.parseDouble(JOptionPane.showInputDialog("Altura (h):"));
            volume = l * w * h;
            break;
        case 3:
            r = Double.parseDouble(JOptionPane.showInputDialog("Raio (r):"));
            volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
            break;
        case 4:
            r = Double.parseDouble(JOptionPane.showInputDialog("Raio (r):"));
            h = Double.parseDouble(JOptionPane.showInputDialog("Altura (h):"));
            volume = Math.PI * Math.pow(r, 2) * h;
            break;
        case 5:
            r = Double.parseDouble(JOptionPane.showInputDialog("Raio (r):"));
            h = Double.parseDouble(JOptionPane.showInputDialog("Altura (h):"));
            volume = (1.0 / 3.0) * Math.PI * Math.pow(r, 2) * h;
            break;
        case 6:
            s = Double.parseDouble(JOptionPane.showInputDialog("Lado da base (s):"));
            h = Double.parseDouble(JOptionPane.showInputDialog("Altura (h):"));
            volume = (1.0 / 3.0) * Math.pow(s, 2) * h;
            break;
        default:
            JOptionPane.showMessageDialog(null, "Opção inválida!");
            return;
    }

    JOptionPane.showMessageDialog(null, "Volume = " + volume);
}
}
