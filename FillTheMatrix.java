import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(", ");
        int index = Integer.parseInt(data[0]);
        String pattern = data[1];
        int[][] matrices = new int[index][index];
        switch (pattern) {
            case "A":
                int startNumber = 1;
                for (int col = 0; col < matrices.length; col++) {
                    for (int row = 0; row < matrices[col].length; row++) {
                        matrices[row][col] = startNumber++;
                    }
                }
                break;
            case "B":
                startNumber = 1;
                for (int col = 0; col < matrices.length; col++) {
                    if (col % 2 == 0) {
                        for (int row = 0; row < matrices[col].length; row++) {
                            matrices[row][col] = startNumber++;
                        }
                    } else {
                        for (int row = matrices.length-1; row >= 0; row--) {
                            matrices[row][col] = startNumber++;
                        }
                    }
                }
                break;

        }

        for (int row = 0; row <matrices.length ; row++) {
            for (int col = 0; col < matrices[row].length ; col++) {
                System.out.print(matrices[row][col]+" ");

            }
            System.out.println("");
        }
    }
}
