import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class sem2_task2 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(bubbleSort(generateArray(10, -10, 10))));
    }

    static int[] generateArray(int size, int min_seed, int max_seed) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(min_seed, max_seed + 1);
        }
        return arr;
    }

    static int[] bubbleSort(int[] array) {
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log_bubbleSort.txt");
        } catch (SecurityException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        logger.addHandler(fileHandler);

        System.out.println(Arrays.toString(array));
        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }
            logger.log(Level.INFO, Arrays.toString(array));
        }
        return array;

    }
}
