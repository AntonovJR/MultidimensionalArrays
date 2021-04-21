import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrices = createMatrices(scanner);

        int sum =0;
        int biggestSum=0;
        String[] numbers = new String[4];

        for (int i = 0; i <matrices.length ; i++) {
            int[] first = matrices[i];
            if(i!=matrices.length-1){
                int[] second = matrices[i+1];

                int counter=0;
                while (counter<first.length-1){

                    sum+=first[counter];
                    sum+=second[counter];

                    sum+=first[counter+1];
                    sum+=second[counter+1];

                    if(sum>biggestSum){
                        biggestSum=sum;
                        numbers[0] = first[counter]+"";
                        numbers[1] = first[counter+1]+"";
                        numbers[2] = second[counter]+"";
                        numbers[3] = second[counter+1]+"";
                    }
                    sum=0;
                    counter++;
                }

            }else{
                break;
            }


        }
        System.out.println(numbers[0]+" "+numbers[1]);
        System.out.println(numbers[2]+" "+numbers[3]);

        System.out.println(biggestSum);

    }
    private static int[][] createMatrices(Scanner scanner) {
        String[] data = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(data[0]);
        int cols = Integer.parseInt(data[1]);
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
