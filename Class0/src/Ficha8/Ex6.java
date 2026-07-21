package Ficha8;

import javax.swing.JOptionPane;

public class Ex6 {
    public static void main(String[] args) {
    	 int a = Integer.parseInt(JOptionPane.showInputDialog("Valor inicial (a):"));
         int b = Integer.parseInt(JOptionPane.showInputDialog("Valor final (b):"));

         String resultado = "";
         int num = a;

         do {
             boolean primo = num > 1;
             int divisor = 2;

             do {
                 if (num % divisor == 0) {
                     primo = false;
                 }
                 divisor++;
             } while (divisor < num && primo);

             if (primo) {
                 resultado += num + " ";
             }

             num++;
         } while (num <= b);

         JOptionPane.showMessageDialog(null, "Primos entre " + a + " e " + b + ": " + resultado);
     }
 }