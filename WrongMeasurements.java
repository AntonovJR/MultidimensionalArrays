import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrices = new int[n][];
        for (int i = 0; i < matrices.length; i++) {
            int[] matricRow = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrices[i] = matricRow;
        }
        String[] indexes = scanner.nextLine().split("\\s+");
        int wrongValue = matrices[Integer.parseInt(indexes[0])][Integer.parseInt(indexes[1])];
        ArrayList<int[]> fixInfo = new ArrayList<>();
        for (int row = 0; row < matrices.length; row++) {
            for (int col = 0; col < matrices[row].length; col++) {
                if (matrices[row][col] == wrongValue) {
                    int rightValue = calculateRightValue(matrices, row, col, wrongValue);
                fixInfo.add(new int[]{row,col,rightValue});

                }

            }

        }
        for (int[] ints : fixInfo) {
            matrices[ints[0]][ints[1]] = ints[2];

        }
        for (int row = 0; row <matrices.length ; row++) {
            for (int col = 0; col < matrices[row].length ; col++) {
                System.out.print(matrices[row][col]+" ");

            }
            System.out.println("");
        }
    }

    private static int calculateRightValue(int[][] matrices, int row, int col, int wrongValue) {
        int rightValue = 0;
        if (isInBounds(matrices, row + 1, col)&&matrices[row+1][col]!=wrongValue) {
            rightValue += matrices[row + 1][col];
        }
        if (isInBounds(matrices, row - 1, col)&&matrices[row-1][col]!=wrongValue) {
            rightValue += matrices[row - 1][col];
        }
        if (isInBounds(matrices, row, col + 1)&&matrices[row][col+1]!=wrongValue) {
            rightValue += matrices[row][col + 1];
        }
        if (isInBounds(matrices, row, col - 1)&&matrices[row][col-1]!=wrongValue) {
            rightValue += matrices[row][col - 1];
        }
        return rightValue;
    }

    private static boolean isInBounds(int[][] matrices, int row, int col) {
        return row < matrices.length && row >= 0 && col < matrices[row].length && col >= 0;
    }
}
