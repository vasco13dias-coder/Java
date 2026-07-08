import javax.swing.JOptionPane;

public class Ficha3_Exe17 {

    public static void main(String[] args) {

        double horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Número de horas trabalhadas no mês:"));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Valor ganho por hora:"));

        double salarioBruto = horasTrabalhadas * valorHora;
        double descontoSegSocial = salarioBruto * 0.11;   // 11%
        double retencaoIRS = salarioBruto * 0.235;        // 23.5%
        double salarioLiquido = salarioBruto - descontoSegSocial - retencaoIRS;

        JOptionPane.showMessageDialog(null,
                "Salário bruto: " + salarioBruto +
                "\nDesconto segurança social: " + descontoSegSocial +
                "\nRetenção IRS: " + retencaoIRS +
                "\nSalário líquido: " + salarioLiquido);
    }
}