package Ficha7;
import javax.swing.JOptionPane;
public class Ex10 {
	public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduza um número entre 0 e 10:"));

        String menu = "Escolha o idioma:\n" +
                      "1 - Português\n" +
                      "2 - Inglês\n" +
                      "3 - Francês\n" +
                      "4 - Espanhol";

        int idioma = Integer.parseInt(JOptionPane.showInputDialog(menu));

        if (numero < 0 || numero > 10) {
            JOptionPane.showMessageDialog(null, "Número inválido!");
            return;
        }

        String extenso;

        switch (idioma) {
            case 1:
                switch (numero) {
                    case 0: extenso = "zero"; break;
                    case 1: extenso = "um"; break;
                    case 2: extenso = "dois"; break;
                    case 3: extenso = "três"; break;
                    case 4: extenso = "quatro"; break;
                    case 5: extenso = "cinco"; break;
                    case 6: extenso = "seis"; break;
                    case 7: extenso = "sete"; break;
                    case 8: extenso = "oito"; break;
                    case 9: extenso = "nove"; break;
                    default: extenso = "dez";
                }
                break;
            case 2:
                switch (numero) {
                    case 0: extenso = "zero"; break;
                    case 1: extenso = "one"; break;
                    case 2: extenso = "two"; break;
                    case 3: extenso = "three"; break;
                    case 4: extenso = "four"; break;
                    case 5: extenso = "five"; break;
                    case 6: extenso = "six"; break;
                    case 7: extenso = "seven"; break;
                    case 8: extenso = "eight"; break;
                    case 9: extenso = "nine"; break;
                    default: extenso = "ten";
                }
                break;
            case 3:
                switch (numero) {
                    case 0: extenso = "zéro"; break;
                    case 1: extenso = "un"; break;
                    case 2: extenso = "deux"; break;
                    case 3: extenso = "trois"; break;
                    case 4: extenso = "quatre"; break;
                    case 5: extenso = "cinq"; break;
                    case 6: extenso = "six"; break;
                    case 7: extenso = "sept"; break;
                    case 8: extenso = "huit"; break;
                    case 9: extenso = "neuf"; break;
                    default: extenso = "dix";
                }
                break;
            case 4:
                switch (numero) {
                    case 0: extenso = "cero"; break;
                    case 1: extenso = "uno"; break;
                    case 2: extenso = "dos"; break;
                    case 3: extenso = "tres"; break;
                    case 4: extenso = "cuatro"; break;
                    case 5: extenso = "cinco"; break;
                    case 6: extenso = "seis"; break;
                    case 7: extenso = "siete"; break;
                    case 8: extenso = "ocho"; break;
                    case 9: extenso = "nueve"; break;
                    default: extenso = "diez";
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Idioma inválido!");
                return;
        }

        JOptionPane.showMessageDialog(null, extenso);
    }
}
