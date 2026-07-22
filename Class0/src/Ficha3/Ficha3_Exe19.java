package Ficha3;

import javax.swing.JOptionPane;

public class Ficha3_Exe19 {

    public static void main(String[] args) {

        // Exemplo: 8053s = 2h 14m 13s

        int segundosTotais = Integer.parseInt(JOptionPane.showInputDialog("Número total de segundos:"));

        int horas = segundosTotais / 3600;
        int minutos = (segundosTotais % 3600) / 60;
        int segundos = segundosTotais % 60;

        JOptionPane.showMessageDialog(null, segundosTotais + "s = " + horas + "h " + minutos + "m " + segundos + "s");
    }
}