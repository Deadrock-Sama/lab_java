import static java.lang.Math.*;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        boolean makeRound = (args.length > 0) && (args[0].equals("-r"));

        long[] c = new long[]{3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23};

        double[] x = new double[20];

        for (int i = 0; i < 20; i++) {

            double base = Math.random();
            double rule = Math.random();
            if (rule > 0.5) {
                x[i] = base * 12;
            } else {
                x[i] = base * -10;
            }


        }
        double[][] matrix = new double[11][20];
        Set<Integer> values = Set.of(5, 7, 13, 15, 21);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (c[i] == 3) {

                    matrix[i][j] = pow(atan((pow(E, -abs(x[j])))), 1.0 / 3.0);

                    continue;
                }
                else {
                    if (values.contains(c[i])) {
                    matrix[i][j] = pow(((0.25 / 3) / (4 / cos(x[j]))), asin(pow(E, -abs(x[j]))));

                    continue;
                }
                }
                if (makeRound) {
                    matrix[i][j] = atan(0.5 * sin(pow(pow(2 * x[j], round(x[j])) * (sin(x[j] + (2 / 3))), 3)));
                }
                else {
                    matrix[i][j] = atan(0.5 * sin(pow(pow(2 * x[j], x[j]) * (sin(x[j] + (2 / 3))), 3)));
                }
                
                System.out.printf("%.3f ", matrix[i][j]);
            }
            System.out.println();
        }


    }

}

