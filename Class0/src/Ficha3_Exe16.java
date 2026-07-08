import javax.swing.JOptionPane;

public class Ficha3_Exe16 {

    public static void main(String[] args) {

        
        double precoHamburger = 2.0;
        double precoCheeseburger = 2.5;
        double precoBatatas = 0.75;
        double precoSumo = 1.0;

        int qtdHamburger = Integer.parseInt(JOptionPane.showInputDialog("Quantos Hamburgers?"));
        int qtdCheeseburger = Integer.parseInt(JOptionPane.showInputDialog("Quantos Cheeseburgers?"));
        int qtdBatatas = Integer.parseInt(JOptionPane.showInputDialog("Quantas Batatas fritas?"));
        int qtdSumo = Integer.parseInt(JOptionPane.showInputDialog("Quantos Sumos?"));

        double total = (qtdHamburger * precoHamburger)
                + (qtdCheeseburger * precoCheeseburger)
                + (qtdBatatas * precoBatatas)
                + (qtdSumo * precoSumo);

        JOptionPane.showMessageDialog(null, "Total a pagar: " + total + " euros");
    }
}