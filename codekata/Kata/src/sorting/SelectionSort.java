package sorting;

import java.util.Arrays;

public class SelectionSort {

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    
    private static int[] sort(int[] a){
        int n = a.length;
        for(int i=0; i<n; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(a[j]<a[min]) min = j;
            }
            swap(a, i, min);
        }
        return a;  
    }
    
    
    public static void main(String[] args){
        System.out.println(Arrays.toString(sort(new int[]{2,4,3,1,5,0})));
    }

}
