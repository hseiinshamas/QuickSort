import java.util.Arrays;


/*

                         Created by hussein shamas


 */




public class quickSort {
    private static void quicksort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = array[highIndex];  // creating our pivot

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;

            }

            while (array[rightPointer] > pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);

        quicksort(array, lowIndex, leftPointer - 1);

        quicksort(array, leftPointer + 1, highIndex);

    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 7, 66, 443, 232, 44, 6, 7, 13, 53, 135};

        System.out.println("The array before : ");
        System.out.println(Arrays.toString(array));
        quicksort(array, 0, array.length - 1);

        System.out.println("The array after quick sort : ");
        System.out.println(Arrays.toString(array));

        /*
        output =The array before :
               [1, 2, 3, 4, 7, 66, 443, 232, 44, 6, 7, 13, 53, 135]

               The array after quick sort :
              [1, 2, 3, 4, 6, 7, 7, 13, 66, 44, 53, 135, 443, 232]

         */
    }

}
