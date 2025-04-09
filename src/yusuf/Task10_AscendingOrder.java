package yusuf;

/*
Write a return method that can sort an int Array in ascending order
without using the sort method of the Arrays class
Ex: int[] arr = {10,9,8,7};
arr = Sort(arr); ==> {7, 8, 9, 10}
 */

import java.util.Arrays;

public class Task10_AscendingOrder {

    public static void main(String[] args) {
        //Default array
        int[] arr = {10, 9, 8, 7};
        //Sorting and printing the array
        System.out.println("Sort(arr) = " + Arrays.toString(sortedArray(arr)));
    }

    /**
     * Method that returns sorted version of any array we give.
     * @param defaultArray
     * @return defaultArray no new Array returns.
     */
    public static int[] sortedArray(int[] defaultArray) {
        for (int i = 0; i < defaultArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < defaultArray.length; j++) {
                if (defaultArray[j] < defaultArray[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = defaultArray[i];
            defaultArray[i] = defaultArray[minIndex];
            defaultArray[minIndex] = temp;
        }
        return defaultArray;
    }

}
