package Ficha3;
import javax.swing.JOptionPane;

public class Ficha3_Exe15 {

    public static void main(String[] args) {

        // Exemplo: entrada manhã 9:00, saída almoço 13:00, entrada tarde 14:00, saída 18:30
        // Resultado esperado: 8h 30m

        int entradaManhaH = Integer.parseInt(JOptionPane.showInputDialog("Hora de entrada (manhã):"));
        int entradaManhaM = Integer.parseInt(JOptionPane.showInputDialog("Minuto de entrada (manhã):"));

        int saidaAlmocoH = Integer.parseInt(JOptionPane.showInputDialog("Hora de saída para almoço:"));
        int saidaAlmocoM = Integer.parseInt(JOptionPane.showInputDialog("Minuto de saída para almoço:"));

        int entradaTardeH = Integer.parseInt(JOptionPane.showInputDialog("Hora de entrada (tarde):"));
        int entradaTardeM = Integer.parseInt(JOptionPane.showInputDialog("Minuto de entrada (tarde):"));

        int saidaFimDiaH = Integer.parseInt(JOptionPane.showInputDialog("Hora de saída (fim do dia):"));
        int saidaFimDiaM = Integer.parseInt(JOptionPane.showInputDialog("Minuto de saída (fim do dia):"));

        
        int entradaManhaTotal = entradaManhaH * 60 + entradaManhaM;
        int saidaAlmocoTotal = saidaAlmocoH * 60 + saidaAlmocoM;
        int entradaTardeTotal = entradaTardeH * 60 + entradaTardeM;
        int saidaFimDiaTotal = saidaFimDiaH * 60 + saidaFimDiaM;

        
        int minutosTrabalhados = (saidaAlmocoTotal - entradaManhaTotal) + (saidaFimDiaTotal - entradaTardeTotal);

        
        int horas = minutosTrabalhados / 60;
        int minutos = minutosTrabalhados % 60;

        JOptionPane.showMessageDialog(null, "Horas trabalhadas: " + horas + "h " + minutos + "m");
    }
}