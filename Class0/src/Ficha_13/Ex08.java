package Ficha_13;

import java.util.*;
public class Ex08 {
    static Scanner s = new Scanner(System.in);
    static int lerInt(String m) { System.out.print(m); return Integer.parseInt(s.nextLine()); }
    static double lerDbl(String m) { System.out.print(m); return Double.parseDouble(s.nextLine()); }
    static String lerTxt(String m) { System.out.print(m); return s.nextLine(); }

    public static void main(String[] args) {
        String[] cNome = new String[10], destino = new String[10], vData = new String[10];
        int[] cIdade = new int[10], vCli = new int[10], vViag = new int[10], vDias = new int[10], vPess = new int[10];
        double[] preco = new double[10];
        int nc = 0, no = 0, nv = 0, op;
        do {
            System.out.println("1- Inserir Cliente\n2- Inserir Oferta Viagem\n3- Marcar Viagem Cliente\n"
                    + "4- Mostrar Clientes\n5- Mostrar Ofertas de Viagem\n6- Mostrar Viagens Marcadas\n0- Sair");
            op = lerInt("Opção = ");
            switch (op) {
                case 1:
                    if (nc == 10) System.out.println("Cheio");
                    else { cNome[nc] = lerTxt("Nome: "); cIdade[nc] = lerInt("Idade: "); nc++; }
                    break;
                case 2:
                    if (no == 10) System.out.println("Cheio");
                    else { destino[no] = lerTxt("Destino: "); preco[no] = lerDbl("Preço/Dia/Pessoa: "); no++; }
                    break;
                case 3: {
                    if (nv == 10) { System.out.println("Cheio"); break; }
                    int c = lerInt("codCliente: "), v = lerInt("codViagem: ");
                    if (c < 0 || c >= nc || v < 0 || v >= no) System.out.println("Códigos inválidos");
                    else {
                        vCli[nv] = c; vViag[nv] = v;
                        vDias[nv] = lerInt("Nº de dias: ");
                        vPess[nv] = lerInt("Nº de pessoas: ");
                        vData[nv] = lerTxt("Data: ");
                        nv++;
                    }
                    break;
                }
                case 4:
                    for (int i = 0; i < nc; i++) System.out.println(i + " - " + cNome[i] + ", " + cIdade[i] + " anos");
                    break;
                case 5:
                    for (int i = 0; i < no; i++) System.out.println(i + " - " + destino[i] + ", " + preco[i] + " €/dia/pessoa");
                    break;
                case 6: {
                    double tot = 0;
                    for (int i = 0; i < nv; i++) {
                        double v = preco[vViag[i]] * vDias[i] * vPess[i];
                        tot += v;
                        System.out.println(cNome[vCli[i]] + " -> " + destino[vViag[i]] + ", " + vDias[i] + " dias, "
                                + vPess[i] + " pessoas, " + vData[i] + ": " + v + " €");
                    }
                    System.out.println("Total final: " + tot + " €");
                    break;
                }
            }
        } while (op != 0);
    }
}