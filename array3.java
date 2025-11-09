import java.util.Scanner;
class DiagonalSumOfSquareArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0;i < array.length; i++) {
            sum += array[i][i];
        }
        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i][array.length - 1 - i];
        }
        System.out.println("Sum of the main diagonal: " + sum);
        System.out.println("Sum of the secondary diagonal: " + sum1);
        scanner.close();
    }
}