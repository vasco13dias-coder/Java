package Ficha8;

import javax.swing.JOptionPane;

public class Ex12 {
    public static void main(String[] args) {
    	int numPessoas = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas vais introduzir?"));

        double somaSalarios = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int mulheres = 0;
        int homens = 0;
        double menorSalario = Double.MAX_VALUE;
        int idadeMenorSalario = 0;
        String sexoMenorSalario = "";

        int contador = 1;

        do {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade da pessoa " + contador + ":"));
            String sexo = JOptionPane.showInputDialog("Sexo (M/F) da pessoa " + contador + ":");
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário da pessoa " + contador + ":"));

            somaSalarios += salario;

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (sexo.equalsIgnoreCase("M")) {
                homens++;
            } else {
                mulheres++;
            }

            if (salario < menorSalario) {
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }

            contador++;
        } while (contador <= numPessoas);

        double mediaSalarios = somaSalarios / numPessoas;

        String resultado = "a) Média salários: " + mediaSalarios + "\n" +
                            "b) Maior idade: " + maiorIdade + " | Menor idade: " + menorIdade + "\n" +
                            "c) Mulheres: " + mulheres + " | Homens: " + homens + "\n" +
                            "d) Menor salário -> Idade: " + idadeMenorSalario + ", Sexo: " + sexoMenorSalario;

        JOptionPane.showMessageDialog(null, resultado);
    }
}