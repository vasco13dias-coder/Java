import javax.swing.JOptionPane;

public class Ficha3_Exe21 {

    public static void main(String[] args) {

        double comprimentoCamiao = 6;
        double raioCamiao = 2;

        double volumeCamiaoM3 = Math.PI * Math.pow(raioCamiao, 2) * comprimentoCamiao;
        double capacidadeCamiaoLitros = volumeCamiaoM3 * 1000;

        double producaoDiaria = Double.parseDouble(JOptionPane.showInputDialog("Produção diária de leite (litros):"));

        
        int numeroCamioes = (int) Math.ceil(producaoDiaria / capacidadeCamiaoLitros);

        JOptionPane.showMessageDialog(null, "Número de camiões necessários: " + numeroCamioes);
    }
}