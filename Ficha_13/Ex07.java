public class Ex07 {
    public static void main(String[] args) {
        int[] min = new int[30], max = new int[30];
        int maiorAmp = -1, dia = 0;
        for (int i = 0; i < 30; i++) {
            int t1 = (int) (Math.random() * 41) - 5;
            int t2 = (int) (Math.random() * 41) - 5;
            min[i] = Math.min(t1, t2);
            max[i] = Math.max(t1, t2);
            System.out.println("Dia " + (i + 1) + ": min=" + min[i] + " max=" + max[i]);
            int amp = max[i] - min[i];
            if (amp > maiorAmp) { maiorAmp = amp; dia = i + 1; }
        }
        System.out.println("Maior amplitude térmica: " + maiorAmp + " graus (dia " + dia + ")");
    }
}