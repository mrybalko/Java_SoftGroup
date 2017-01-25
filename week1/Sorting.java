package week1.homework;

import java.util.Arrays;

public class Sorting {

    public int[] bubbleSort(int[] array){
        for (int i = array.length -1; i > 1; i--){
            for (int j = 0; j < i; j++){
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public int [] bubbleReverseSort(int[] array) {
        for (int i = array.length -1; i > 0; i--) {// diff1: i > 0 instead of i > 1
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {//diff2: '>' instead of '<'
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public int[] selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIdx = i;
            //search minimum element and it's index
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIdx = j;
                }
            }
            //if index was changed
            if (i != minIdx) {
                int temp = array[i];
                array[i] = array[minIdx];
                array[minIdx] = temp;
            }
        }
        return array;
    }

    public int[] insertionSort(int[] array){
        for(int i = 1; i < array.length; i++)
            for(int j = i; j > 0 && array[j-1] > array[j]; j--) { // пока j>0 и элемент j-1 > j
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        return array;
    }

    public static void main(String[] args) {
        int [] array = {2, 12, 43, 254, 1, 18, 48, 453, 22, 10, 4, 16};
        Sorting sort = new Sorting();
//        sort.bubbleSort(array);
//        sort.bubbleReverseSort(array);
//        sort.selectionSort(array);
//        sort.insertionSort(array);
        System.out.println(Arrays.toString(array));

    }
}
