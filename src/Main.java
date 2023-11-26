import java.util.Random;
public class Main {
    public static void main(String[] args) {

        int[] numbersArray = new int[10];

        // Filling the array with random numbers from 1 to 100
        Random random = new Random();
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = random.nextInt(100) + 1;
        }

        // Displaying the array
        System.out.println("Array elements:");
        for (int number : numbersArray) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Finding the smallest and largest elements
        int min = numbersArray[0];
        int max = numbersArray[0];

        for (int i = 1; i < numbersArray.length; i++) {
            if (numbersArray[i] < min) {
                min = numbersArray[i];
            }
            if (numbersArray[i] > max) {
                max = numbersArray[i];
            }
        }

        // Displaying the smallest and largest elements
        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);


    }
}