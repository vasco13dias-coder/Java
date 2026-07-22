package Ficha3;
import javax.swing.JOptionPane;

public class Ficha3_Exe7 {

    public static void main(String[] args) {

       
        double nota1 = 11;
        double nota2 = 17;
        double nota3 = 9;

       
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média:" + media);
       
        JOptionPane.showMessageDialog(null, "A média das 3 notas é: " + media);
    }
}
