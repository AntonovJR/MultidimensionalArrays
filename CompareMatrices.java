import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrices = createMatrices(scanner);
        int[][] secondMatrices = createMatrices(scanner);

        if (matricesAreEqual(matrices, secondMatrices)) {
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

    }

    private static int[][] createMatrices(Scanner scanner) {
        String[] data = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(data[0]);
        int cols = Integer.parseInt(data[1]);
        int[][] matrices = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] matricRow = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrices[i] = matricRow;
        }
        return matrices;
    }


    static boolean matricesAreEqual(int[][] firstMatrix, int[][] secondMatrix) {

        if (firstMatrix.length != secondMatrix.length) return false;

        for (int row = 0; row < firstMatrix.length; row++) {

            if (firstMatrix[row].length != secondMatrix[row].length)

                return false;

            for (int col = 0; col < firstMatrix[row].length; col++) {

                if (firstMatrix[row][col] != secondMatrix[row][col]) return false;

            }

        }

        return true;

    }
}
