import java.util.*;
public class Ex09 {
    static Scanner s = new Scanner(System.in);
    static int lerInt(String m) { System.out.print(m); return Integer.parseInt(s.nextLine()); }
    static double lerDbl(String m) { System.out.print(m); return Double.parseDouble(s.nextLine()); }
    static String lerTxt(String m) { System.out.print(m); return s.nextLine(); }

    public static void main(String[] args) {
        String[] cNome = new String[100], marca = new String[100], comb = new String[100], vData = new String[100];
        int[] cIdade = new int[100], vCli = new int[100], vCarro = new int[100];
        double[] preco = new double[100];
        boolean[] vendido = new boolean[100];
        int nc = 0, nk = 0, nv = 0, op;
        do {
            System.out.println("1- Inserir Cliente\n2- Inserir Carro\n3- Inserir Venda\n"
                    + "4- Mostrar Clientes\n5- Mostrar Carros por Vender\n6- Mostrar Vendas\n0- Sair");
            op = lerInt("Opção = ");
            switch (op) {
                case 1:
                    if (nc == 100) System.out.println("Cheio");
                    else { cNome[nc] = lerTxt("Nome: "); cIdade[nc] = lerInt("Idade: "); nc++; }
                    break;
                case 2:
                    if (nk == 100) System.out.println("Cheio");
                    else {
                        marca[nk] = lerTxt("Marca: ");
                        preco[nk] = lerDbl("Preço: ");
                        comb[nk] = lerTxt("Tipo de combustível: ");
                        vendido[nk] = false;
                        nk++;
                    }
                    break;
                case 3: {
                    if (nv == 100) { System.out.println("Cheio"); break; }
                    int c = lerInt("codCliente: "), k = lerInt("codCarro: ");
                    if (c < 0 || c >= nc || k < 0 || k >= nk) System.out.println("Códigos inválidos");
                    else if (vendido[k]) System.out.println("Carro já vendido");
                    else {
                        vCli[nv] = c; vCarro[nv] = k;
                        vData[nv] = lerTxt("Data: ");
                        vendido[k] = true;
                        nv++;
                    }
                    break;
                }
                case 4:
                    for (int i = 0; i < nc; i++) System.out.println(i + " - " + cNome[i] + ", " + cIdade[i] + " anos");
                    break;
                case 5:
                    for (int i = 0; i < nk; i++)
                        if (!vendido[i]) System.out.println(i + " - " + marca[i] + ", " + preco[i] + " €, " + comb[i]);
                    break;
                case 6: {
                    double tot = 0;
                    for (int i = 0; i < nv; i++) {
                        tot += preco[vCarro[i]];
                        System.out.println(cNome[vCli[i]] + " comprou " + marca[vCarro[i]] + " por "
                                + preco[vCarro[i]] + " € em " + vData[i]);
                    }
                    System.out.println("Total: " + tot + " €");
                    break;
                }
            }
        } while (op != 0);
    }
}