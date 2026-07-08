import javax.swing.JOptionPane;

public class Ficha3_Exe13 {

    public static void main(String[] args) {
    	//teste 1 14
    	//teste 2 16
    	//TrabPratico 1 18
    	//TrabPratico 2 16
    	//TrabPratico 3 17
    	//TrabFinal 12

        
        String inputTeste1 = JOptionPane.showInputDialog("Introduza a nota do 1º teste:");
        double teste1 = Double.parseDouble(inputTeste1);

        String inputTeste2 = JOptionPane.showInputDialog("Introduza a nota do 2º teste:");
        double teste2 = Double.parseDouble(inputTeste2);

        
        double mediaTestes = (teste1 + teste2) / 2;

        
        String inputTrab1 = JOptionPane.showInputDialog("Introduza a nota do 1º trabalho prático:");
        double trab1 = Double.parseDouble(inputTrab1);

        String inputTrab2 = JOptionPane.showInputDialog("Introduza a nota do 2º trabalho prático:");
        double trab2 = Double.parseDouble(inputTrab2);

        String inputTrab3 = JOptionPane.showInputDialog("Introduza a nota do 3º trabalho prático:");
        double trab3 = Double.parseDouble(inputTrab3);

        
        double mediaTrabalhos = (trab1 + trab2 + trab3) / 3;

        
        String inputFinal = JOptionPane.showInputDialog("Introduza a nota do trabalho final:");
        double trabalhoFinal = Double.parseDouble(inputFinal);

        
        double notaFinal = (mediaTestes * 0.60) + (mediaTrabalhos * 0.20) + (trabalhoFinal * 0.20);

       
        JOptionPane.showMessageDialog(null, "A nota final do aluno é: " + notaFinal);
    }
}
