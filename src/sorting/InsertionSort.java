package sorting;

public class InsertionSort {

    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int k = i - 1;
            while (k >= 0 && array[k] > currentElement) {
                array[k + 1] = array[k];
                k -= 1;
            }
            array[k + 1] = currentElement;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 4,-1,0,200,11,1123};
        int[] sortedArray = sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}