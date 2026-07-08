import javax.swing.JOptionPane;

public class Ficha3_Exe11 {

    public static void main(String[] args) {

    	// Exemplo de valores para testar:
    	// raio = 3
    	// altura = 5
    	// Resultado esperado: V ≈ 141.37
    	
        String inputRaio = JOptionPane.showInputDialog("Introduza o raio da base:");
        double raio = Double.parseDouble(inputRaio);

     
        String inputAltura = JOptionPane.showInputDialog("Introduza a altura do cilindro:");
        double altura = Double.parseDouble(inputAltura);

       
        double volume = Math.PI * Math.pow(raio, 2) * altura;

       
        JOptionPane.showMessageDialog(null, "O volume do cilindro é: " + volume);
    }
}
