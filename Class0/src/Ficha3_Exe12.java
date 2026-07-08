import javax.swing.JOptionPane;

public class Ficha3_Exe12 {

    public static void main(String[] args) {

        String inputEuros = JOptionPane.showInputDialog("Introduza a quantia em euros:");
        double euros = Double.parseDouble(inputEuros);

        double taxaCambio = 1.08; 

        double dolares = euros * taxaCambio;

        
        JOptionPane.showMessageDialog(null, euros + " euros equivalem a " + dolares + " dólares");
    }
}
