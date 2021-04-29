package activities;

import java.util.Arrays;

class Activity4 {
    static void ascendingSort(int array[]) {
        int size = array.length, i;
        
        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
    
    public static void main(String args[]) {
        int[] data = { 5, 10, 3, 6, 11, 20 };
        System.out.println(Arrays.toString(data));
        ascendingSort(data);
        System.out.println("Sorted Array in Ascending Order: "+ Arrays.toString(data));
        
    }
}