package Ficha6;
import javax.swing.JOptionPane;
public class Ficha6_Exe10 {

	public static void main(String[] args) {
		boolean macacoASorri = Boolean.parseBoolean(JOptionPane.showInputDialog("Macaco A está a sorrir? (true/false):"));
        boolean macacoBSorri = Boolean.parseBoolean(JOptionPane.showInputDialog("Macaco B está a sorrir? (true/false):"));

        if (macacoASorri == macacoBSorri) {
            JOptionPane.showMessageDialog(null, "Temos problemas.");
        } else {
            JOptionPane.showMessageDialog(null, "Não temos problemas.");
        }

        System.exit(0);
	}  

}
