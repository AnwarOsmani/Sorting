package sorting;

public class BubleSort {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] array = {100, 0, -33, 4, 300, 55, -2, -9, 22, 88, 104};
        BubleSort.display(array);
        System.out.println("\n---------------------------------------");
        BubleSort.sort(array);
        BubleSort.display(array);
    }
}
