import java.util.Arrays;

public class objectBasics {
    static String dashedLine() {
        StringBuilder sb = new StringBuilder(20);
        for (int n = 0; n < 110; ++n)
            sb.append('-');
        sb.append(System.lineSeparator());
        return sb.toString();
    }

    public static void main(String[] args) {
        String sol = "To be or not to be, that is the question".toLowerCase().replaceAll("[^a-zA-z0-9]", "");
        char[] a2z = sol.toCharArray();
        Arrays.sort(a2z);
        System.out.print(dashedLine());
        for (int i = 0; i < a2z.length; i++) {
            System.out.print(a2z[i] + " | ");
        }
        System.out.println();
        System.out.print(dashedLine());
    }
}
