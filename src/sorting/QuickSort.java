package sorting;

import java.util.Arrays;

public class QuickSort {

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    private static int partition(int[] a, int lo, int hi) {
        int i=lo+1, j=lo+1;
        int pivot = a[lo];
        
        while(i<=hi && j<=hi) {
            if(a[i] < pivot) swap(a, i++, j++);
            else i++;
        }
        swap(a, lo, j-1);
        
        return j-1;
    
    }
    
    private static int partition3Way(int[] a, int lo, int hi) {
    	int lt = lo;
    	int gt = hi;
    	int pivot = a[lo];
    	int i = lo;
    	while(i<=gt){
    		if(a[i]<pivot) swap(a, i++, lt++);
    		else if(a[i]>pivot) swap(a,i,gt--);
    		else i++;
    	}
    	
    	return i-1;
    }
    
    private static int[] sort(int[] a, int lo, int hi){
        if(lo>=hi) return a;
        int p = partition3Way(a, lo, hi);
        sort(a, lo, p-1);
        sort(a, p+1, hi);
        
        return a;
    }
    

    public static void main(String[] args){
        System.out.println(Arrays.toString(sort(new int[]{2,4,3,1,5,0}, 0, 5)));
        System.out.println(Arrays.toString(sort(new int[]{2,4,3,1,2,-2}, 0, 5)));
        System.out.println(Arrays.toString(sort(new int[]{2,2,2,2,2,2}, 0, 5)));
    }

}
