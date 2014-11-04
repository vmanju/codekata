package sorting;

import java.util.Arrays;

public class MergeSort {

    private static int[] merge(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int[] aux = new int[n1+n2];
        int i=0, j=0, k=0;
        
        while(i<n1 && j<n2){
            if(a[i] < b[j]) aux[k++] = a[i++];
            else aux[k++] = b[j++];
        }
        
        while(i<n1) aux[k++] = a[i++];
        while(j<n2) aux[k++] = b[j++];
        
        return aux;
    
    }
    private static int[] sort(int[] a, int lo, int hi){
          if(lo==hi) return new int[]{a[lo]};
    	  
          int mid = lo + (hi-lo)/2;
          int[] first = sort(a, lo, mid);
          int[] second = sort(a, mid+1, hi);
          int[] aux = merge(first, second);
          
          return aux;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(sort(new int[]{2,4,3,1,5,0}, 0, 5)));
    }

}