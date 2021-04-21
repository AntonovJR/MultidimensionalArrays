import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        int num = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        for (int row = 0; row <matrices.length ; row++) {
            for (int col = 0; col < matrices[row].length ; col++) {
                if(matrices[row][col]==num){
                    System.out.println(row+" "+col);
                    isFound=true;
                }
            }
            
        }
        if(!isFound){
            System.out.println("not found");

        }
    }
}
