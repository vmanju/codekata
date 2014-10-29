package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class HeapSort {

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    private static void sink(int[] a, int k, int n) {
        while(2*k+1 <= n) {
            int j = 2*k+1;
            if(j<n && a[j]<a[j+1]) j++;
            if(a[k]<a[j]) swap(a, k, j);
            k = j;
        }
        
    }
    
    private static void buildHeap(int[] a){
        int n = a.length-1;
        for(int k = n/2; k>=0; k--)
            sink(a, k, n);
    }
    
    private static int[] sort(int[] a){
        buildHeap(a);
        int n = a.length-1;
        while(n>0){
            swap(a, 0, n--);
            sink(a, 0, n);
        }
        
        return a;
    }

    public static void main(String[] args){
    	int[] a = new int[]{2,4,3,1,2,-2};
        //System.out.println(Arrays.toString(sort(new int[]{2,4,3,1,5,0})));
        System.out.println(Arrays.toString(sort(a)));
        //System.out.println(Arrays.toString(sort(new int[]{2,2,2,2,2,2})));
        
        // Using java priority queue
        Queue<Integer> q = new PriorityQueue<>();
        for(int i: a)
        	q.add(i);
        List<Integer> result = new ArrayList<>();
        while(q.size()>0)
        	result.add(q.poll());
        System.out.println(Arrays.toString(result.toArray()));
        	
    }

}