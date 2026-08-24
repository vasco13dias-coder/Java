package Ficha6;
import javax.swing.JOptionPane;

public class Ficha6_Exe22 {
    public static void main(String[] args) {
    	int prato = Integer.parseInt(JOptionPane.showInputDialog(
                "Prato: 1-Vegetariano (180cal), 2-Peixe (230cal), 3-Carne (250cal)"));
        int sobremesa = Integer.parseInt(JOptionPane.showInputDialog(
                "Sobremesa: 1-Fruta (75cal), 2-Gelado (110cal), 3-Mousse (200cal)"));
        int bebida = Integer.parseInt(JOptionPane.showInputDialog(
                "Bebida: 1-Chá (20cal), 2-Sumo Laranja (70cal), 3-Refrigerante (100cal)"));

        int totalCalorias = 0;
        if (prato == 1) totalCalorias += 180;
        else if (prato == 2) totalCalorias += 230;
        else if (prato == 3) totalCalorias += 250;

        if (sobremesa == 1) totalCalorias += 75;
        else if (sobremesa == 2) totalCalorias += 110;
        else if (sobremesa == 3) totalCalorias += 200;

        if (bebida == 1) totalCalorias += 20;
        else if (bebida == 2) totalCalorias += 70;
        else if (bebida == 3) totalCalorias += 100;

        JOptionPane.showMessageDialog(null, "Total de calorias da refeição: " + totalCalorias + " cal");

        System.exit(0);
    }
}
