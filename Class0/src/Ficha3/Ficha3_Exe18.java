package Ficha3;
import javax.swing.JOptionPane;

public class Ficha3_Exe18 {

    public static void main(String[] args) {

       

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso (kg):"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura (m):"));

        double imc = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, "O seu IMC é: " + imc);
    }
}