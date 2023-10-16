import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5, 6, 7};

        
        Random rand = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            
            int index = rand.nextInt(i + 1);

            
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        System.out.println("Shuffled Array: " + Arrays.toString(arr));
    }
}
