package sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {7, 5, 2, 8, 1, 4};
        sort(array);
       for(int i=0;i<array.length;i++){
           System.out.println(array[i]);
       }
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMinIndex = i;
            int currentMin = array[i];
            System.out.println("in i loop");
            System.out.println("CurrentMinIndex is : "+currentMinIndex+"\t,"+
                    "CurrentMin is : "+currentMin);
            for (int k = i + 1; k < array.length; k++) {
                if (array[k] < currentMin) {
                    currentMin = array[k];
                    currentMinIndex = k;
                    System.out.println("\tin J loop");
                    System.out.println("\tCurrentMinIndex is : "+currentMinIndex+"\t,"+
                    "CurrentMin is : "+currentMin);
                }
            }
            if(currentMinIndex!=i){
                array[currentMinIndex]=array[i];
                array[i]=currentMin;
            }
        }
    }

}
