package week1.homework;

import java.util.Random;

public class ArraySum {
    private int [][] array = new int [5][8];

    public int[][] fillArray(){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(101);
            }
        }
        return array;
    }
    public void printArray(){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    public int calculateSum(){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ArraySum array = new ArraySum();
        array.fillArray();
        array.printArray();
        System.out.printf("Sum of all elements in array is: %d", array.calculateSum());

    }
}
