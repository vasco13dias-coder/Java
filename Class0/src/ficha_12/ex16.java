public import java.util.Scanner;

public class ex16 {
    static Scanner sc = new Scanner(System.in);

    static int diasDoMes(int mes) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        System.out.print("Mês (1-12): ");
        int mes = sc.nextInt();
        int dias = diasDoMes(mes);
        if (dias == -1) {
            System.out.println("Mês inválido");
        } else {
            System.out.println("O mês " + mes + " tem " + dias + " dias");
        }
    }
} {
    
}
