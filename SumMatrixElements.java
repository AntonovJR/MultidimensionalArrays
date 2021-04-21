import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(data[0]);
        int cols = Integer.parseInt(data[1]);
        int[][] matrices = createMatrices(scanner, rows,cols);
        System.out.println(matrices.length);
        System.out.println(matrices[0].length);
        int sum = 0;
        for (int i = 0; i < matrices.length; i++) {
            for (int j = 0; j < matrices[i].length ; j++) {
                sum+=matrices[i][j];

            }

        }
        System.out.println(sum);

    }

    private static int[][] createMatrices(Scanner scanner, int rows, int cols) {
        int[][] matrices = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] matricRow = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrices[i] = matricRow;
        }
        return matrices;
    }

}
