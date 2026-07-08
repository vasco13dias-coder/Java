package Ficha6;
import javax.swing.JOptionPane;

public class Ficha6_Exe23 {
    public static void main(String[] args) {
    	int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7:"));

        String nomeDia;
        if (dia == 1) nomeDia = "Domingo";
        else if (dia == 2) nomeDia = "Segunda-feira";
        else if (dia == 3) nomeDia = "Terça-feira";
        else if (dia == 4) nomeDia = "Quarta-feira";
        else if (dia == 5) nomeDia = "Quinta-feira";
        else if (dia == 6) nomeDia = "Sexta-feira";
        else if (dia == 7) nomeDia = "Sábado";
        else nomeDia = "Não existe dia da semana com esse número.";

        JOptionPane.showMessageDialog(null, nomeDia);

        System.exit(0);
    }
}
