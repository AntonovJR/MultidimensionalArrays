import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data = Integer.parseInt(scanner.nextLine());
        int[][] matrices = new int[data][data];
        for (int i = 0; i < data; i++) {
            int[] matricRow = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrices[i] = matricRow;
        }

        for (int i = 0; i < data; i++) {
            for (int j = 0; j < data; j++) {
                if (i == j) {
                    System.out.print(matrices[i][j] + " ");
                }
            }
        }
        System.out.println("");
        for (int i = matrices.length-1; i>=0; i--) {
            for (int j = 0; j < data; j++) {
                if ((i + j) == (data - 1)) {
                    System.out.print(matrices[i][j] + " ");
                }
            }
        }
    }
}




