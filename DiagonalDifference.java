import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrices = createMatrix(scanner);
        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;
        for (int i = 0; i < matrices.length; i++) {
            for (int j = 0; j < matrices[i].length; j++) {
                if (i == j) {
                    sumFirstDiagonal+=matrices[i][j];
                }
            }
        }
        System.out.println("");
        for (int i = matrices.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrices[i].length; j++) {
                if ((i + j) == (matrices.length - 1)) {
                    sumSecondDiagonal+=matrices[i][j];
                }
            }
        }
        System.out.println(Math.abs(sumFirstDiagonal-sumSecondDiagonal));
    }

    private static int[][] createMatrix(Scanner scanner) {
        int data = Integer.parseInt(scanner.nextLine());
        int[][] matrices = new int[data][data];
        for (int i = 0; i < data; i++) {
            int[] matricRow = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrices[i] = matricRow;
        }
        return matrices;
    }
}
