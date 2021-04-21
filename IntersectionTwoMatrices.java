import java.util.Scanner;

public class IntersectionTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        String[][] matrices = createMatrices(scanner, rows,cols);
        String[][] secondMatrices = createMatrices(scanner, rows,cols);
        String[][] thirdMatrices = new String[rows][cols];
        for (int row = 0; row < matrices.length ; row++) {
            for (int col = 0; col < matrices[row].length ; col++) {
                if(matrices[row][col].equals(secondMatrices[row][col])){
                    thirdMatrices[row][col] = matrices[row][col];
                }else{
                    thirdMatrices[row][col] = "*";
                }

            }

        }
        for (int row = 0; row <thirdMatrices.length ; row++) {
            for (int col = 0; col < thirdMatrices[row].length ; col++) {
                    System.out.print(thirdMatrices[row][col]+" ");

                }
            System.out.println("");
            }

        }

    private static String[][] createMatrices(Scanner scanner, int rows, int cols) {
        String[][] matrices = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] matricRow = scanner.nextLine().split("\\s+");
            matrices[i] = matricRow;
        }
        return matrices;
    }

}
