package Ficha7;
import javax.swing.JOptionPane;
public class Ex17 {
	 public static void main(String[] args) {
	        int d = Integer.parseInt(JOptionPane.showInputDialog("Introduza o dia de nascimento (D):"));
	        int m = Integer.parseInt(JOptionPane.showInputDialog("Introduza o mês de nascimento (M):"));
	        int a = Integer.parseInt(JOptionPane.showInputDialog("Introduza o ano de nascimento (A):"));

	        long n = Long.parseLong("" + d + m + a);

	        int z = (int) (n % 9);
	        if (z == 0) {
	            z = 9;
	        }

	        String tipo;

	        switch (z) {
	            case 1: tipo = "irresistível"; break;
	            case 2: tipo = "impetuoso"; break;
	            case 3: tipo = "discreto"; break;
	            case 4: tipo = "amoroso"; break;
	            case 5: tipo = "tímido"; break;
	            case 6: tipo = "conquistador"; break;
	            case 7: tipo = "estudioso"; break;
	            case 8: tipo = "sonhador"; break;
	            case 9: tipo = "charmoso"; break;
	            default: tipo = "desconhecido";
	        }

	        JOptionPane.showMessageDialog(null, "N = " + n + "\nZ = " + z + "\nTipo característico: " + tipo);
	    }
}
