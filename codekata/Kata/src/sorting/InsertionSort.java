package sorting;

import java.util.Arrays;

public class InsertionSort {

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    /**
     * Insertion sort is an algorithm that seeks to sort a list one element at a time. 
     * With each iteration, it takes the next element waiting to be sorted, 
     * and adds it, in proper location, to those elements that have already been sorted.
     * @param a
     * @return
     */
    private static int[] sort(int[] a){
        int n = a.length;
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(a[j]>a[i]) swap(a, i, j);
            }
        }
        return a;  
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(sort(new int[]{2,4,3,1,5,0})));
    }

}
