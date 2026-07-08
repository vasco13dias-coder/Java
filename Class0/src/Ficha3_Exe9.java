import javax.swing.JOptionPane;

public class Ficha3_Exe9 {

    public static void main(String[] args) {

    	// Exemplo de valores para testar:
        // So = 0   -> já estava na posição 0 metros
        // Vo = 5   -> ia a 5 m/s
        // a  = 2   -> acelerou a 2 m/s²
        // t  = 4   -> durante 4 segundos
        // Resultado esperado: S = 36 metros

        double so;
        double vo;
        double a;
        double t;
        double s;
        String inputSo = JOptionPane.showInputDialog("Introduza o deslocamento inicial (So):");
        so = Double.parseDouble(inputSo);

       
        String inputVo = JOptionPane.showInputDialog("Introduza a velocidade inicial (Vo):");
        vo = Double.parseDouble(inputVo);

        
        String inputA = JOptionPane.showInputDialog("Introduza a aceleração (a):");
        a = Double.parseDouble(inputA);

        
        String inputT = JOptionPane.showInputDialog("Introduza o tempo decorrido (t):");
        t = Double.parseDouble(inputT);

        
        s = so + (vo * t) + (0.5 * a * t * t);

        
        JOptionPane.showMessageDialog(null, "O deslocamento final (S) é: " + s);
    }
}
