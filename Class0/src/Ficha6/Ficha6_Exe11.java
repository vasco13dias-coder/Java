package Ficha6;
import javax.swing.JOptionPane;
public class Ficha6_Exe11 {

	public static void main(String[] args) {
		int hora = Integer.parseInt(JOptionPane.showInputDialog("Hora atual (0-23):"));
        boolean falando = Boolean.parseBoolean(JOptionPane.showInputDialog("O papagaio está a falar? (true/false):"));

        if (falando && (hora < 7 || hora > 20)) {
            JOptionPane.showMessageDialog(null, "Temos problemas.");
        } else {
            JOptionPane.showMessageDialog(null, "Não temos problemas.");
        }

        System.exit(0);
	}  

}
