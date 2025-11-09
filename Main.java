
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i=0;i < size;i++) {
            int sumRight = 0;
            for (int j = i + 1; i < size; j++) {
                sumRight += array[j];
            }
            if (array[i] > sumRight) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
