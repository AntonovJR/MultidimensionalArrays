import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matrix = createMatrix(scanner);
        String[] commands = scanner.nextLine().split("\\s+");
        while (!"END".equals(commands[0])) {
            if ("swap".equals(commands[0]) && commands.length == 5) {

                int indexOneStart = Integer.parseInt(commands[1]);
                int indexOneEnd = Integer.parseInt(commands[2]);
                int indexTwoStart = Integer.parseInt(commands[3]);
                int indexTwoEnd = Integer.parseInt(commands[4]);
                if (indexOneStart >= 0 && indexOneStart <= matrix[0].length
                        && indexTwoStart >= 0 && indexTwoStart <= matrix[0].length
                        && indexOneEnd >= 0 && indexOneEnd <= matrix.length
                        && indexTwoEnd >= 0 && indexTwoEnd <= matrix.length) {

                    String temp = matrix[indexTwoStart][indexTwoEnd];
                    matrix[indexTwoStart][indexTwoEnd] = matrix[indexOneStart][indexOneEnd];
                    matrix[indexOneStart][indexOneEnd] = temp;

                    for (int row = 0; row < matrix.length; row++) {
                        for (int col = 0; col < matrix[row].length; col++) {
                            System.out.print(matrix[row][col] + " ");

                        }
                        System.out.println("");
                    }

                } else {
                    System.out.println("Invalid input!");
                }


            }else {
                System.out.println("Invalid input!");
            }
            commands = scanner.nextLine().split("\\s+");
        }
    }

    private static String[][] createMatrix(Scanner scanner) {
        String[] data = scanner.nextLine().split("\\s+");
        String[][] matrices = new String[Integer.parseInt(data[0])][Integer.parseInt(data[1])];
        for (int i = 0; i < Integer.parseInt(data[0]); i++) {
            String[] matricRow = scanner.nextLine().split("\\s+");
            matrices[i] = matricRow;
        }
        return matrices;
    }
}
