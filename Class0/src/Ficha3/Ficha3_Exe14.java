package Ficha3;
import javax.swing.JOptionPane;

public class Ficha3_Exe14 {

    public static void main(String[] args) {

        // Exemplo de valores para testar:
        // comprimento = 5, largura = 4, altura = 2.5
        // porta: largura = 0.9, altura = 2.1
        // janela1: largura = 1.2, altura = 1
        // janela2: largura = 1, altura = 0.8

        double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Comprimento da sala (m):"));
        double largura = Double.parseDouble(JOptionPane.showInputDialog("Largura da sala (m):"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura da sala (m):"));

        double portaLargura = Double.parseDouble(JOptionPane.showInputDialog("Largura da porta (m):"));
        double portaAltura = Double.parseDouble(JOptionPane.showInputDialog("Altura da porta (m):"));

        double janela1Largura = Double.parseDouble(JOptionPane.showInputDialog("Largura da janela 1 (m):"));
        double janela1Altura = Double.parseDouble(JOptionPane.showInputDialog("Altura da janela 1 (m):"));

        double janela2Largura = Double.parseDouble(JOptionPane.showInputDialog("Largura da janela 2 (m):"));
        double janela2Altura = Double.parseDouble(JOptionPane.showInputDialog("Altura da janela 2 (m):"));

        
        double areaParedes = 2 * (comprimento + largura) * altura;

        
        double areaPorta = portaLargura * portaAltura;
        double areaJanela1 = janela1Largura * janela1Altura;
        double areaJanela2 = janela2Largura * janela2Altura;

        double areaLiquida = areaParedes - areaPorta - areaJanela1 - areaJanela2;

        double litrosTinta = areaLiquida / 20;

        JOptionPane.showMessageDialog(null, "Litros de tinta necessários: " + litrosTinta);
    }
}