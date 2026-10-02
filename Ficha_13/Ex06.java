import java.util.*;
public class Ex06 {
    static Scanner s = new Scanner(System.in);
    static int lerInt(String m) { System.out.print(m); return Integer.parseInt(s.nextLine()); }
    public static void main(String[] args) {
        int n = lerInt("n: ");
        int[] a = new int[n], b = new int[n], c = new int[2 * n];
        for (int i = 0; i < n; i++) a[i] = lerInt("a[" + i + "]=");
        for (int i = 0; i < n; i++) b[i] = lerInt("b[" + i + "]=");
        for (int i = 0; i < n; i++) {
            c[2 * i] = a[i];
            c[2 * i + 1] = b[n - 1 - i];
        }
        System.out.println(Arrays.toString(c));
    }
}