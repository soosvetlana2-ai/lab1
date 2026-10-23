import java.util.Random;

public class Lab1 {

    static double calculateElement(long bi, float xf) {
        double x = xf;
        if (bi == 22) {
            return Math.pow(Math.pow(Math.pow(3 * (4 - x), 2), 2 * Math.cos(x)), 2);
        } else if (bi == 2 || bi == 8 || bi == 14 || bi == 16 || bi == 20) {
            return Math.pow(0.5 * (1 - Math.pow((x / (x + 1)) / 2, 2)), 3);
        } else {
            return 3 * Math.pow(2 * x, Math.pow(x, x - 1)) + 1;
        }
    }

    static void printMatrix(double[][] e) {
        for (double[] row : e) {
            StringBuilder sb = new StringBuilder();
            for (double v : row) {
                sb.append(String.format("%10.3f", v));
            }
            System.out.println(sb);
        }
    }
    public static void main(String[] args) {
        long[] b = new long[11];
        for (int i = 0; i < b.length; i++) {
            b[i] = 22 - 2L * i;
        }

        Random random = new Random();
        float[] x = new float[15];
        for (int j = 0; j < x.length; j++) {
            x[j] = -10.0f + random.nextFloat() * 24.0f;
        }

        double[][] e = new double[b.length][x.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < x.length; j++) {
                e[i][j] = calculateElement(b[i], x[j]);
            }
        }

        printMatrix(e);
    }
}
