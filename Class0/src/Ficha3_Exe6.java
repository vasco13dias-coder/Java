import javax.swing.JOptionPane;

public class Ficha3_Exe6 {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Introduza a temperatura em Fahrenheit:");
        double fahrenheit = Double.parseDouble(input);

        double celsius = (fahrenheit - 32) * (5.0 / 9.0);

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + "°F");
        System.out.println("Temperatura em Celsius: " + celsius + "°C");
    }
}