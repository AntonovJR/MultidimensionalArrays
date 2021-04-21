import java.util.ArrayList;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().replaceAll("\\D+", "");
        int degree = Integer.parseInt(str) % 360;
        String input = scanner.nextLine();
        ArrayList<String> data = new ArrayList<>();
        int maxLenght = input.length();
        while (!"END".equals(input)) {
            data.add(input);
            input = scanner.nextLine();
            if (input.length() > maxLenght) {
                maxLenght = input.length();
            }
        }
        char[][] matrix = new char[data.size()][maxLenght];
        for (int row = 0; row < data.size(); row++) {
            for (int col = 0; col < maxLenght; col++) {
                if (col < data.get(row).length()) {
                    matrix[row][col] = data.get(row).charAt(col);
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }
        rotated(degree, data, maxLenght, matrix);


    }

    private static void rotated(int degree, ArrayList<String> data, int maxLenght, char[][] matrix) {
        if (degree == 90) {
            for (int col = 0; col < maxLenght; col++) {
                for (int row = data.size() - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col] + "");
                }
                System.out.println();
            }
        } else if (degree == 180) {
            for (int row = data.size() - 1; row >= 0; row--) {
                for (int col = maxLenght -1; col >= 0; col--) {
                    System.out.print(matrix[row][col] + "");
                }
                System.out.println();
            }
        }else if (degree == 270) {
            for (int col = maxLenght -1; col >= 0; col--) {
                for (int row = 0; row < data.size(); row++) {
                    System.out.print(matrix[row][col] + "");
                }
                System.out.println();
            }
        }else{
            for (int row = 0; row < data.size(); row++) {
                for (int col = 0; col< maxLenght; col++) {
                    System.out.print(matrix[row][col] + "");
                }
                System.out.println();
            }
        }
    }


}
