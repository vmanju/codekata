package fundamentals;

import java.util.Arrays;

public class BinarySearch {

    private static int binarySearch(int[] a, int target){
        int lo = 0;
        int hi = a.length-1;
        Arrays.sort(a);
        
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(a[mid] == target) return mid;
            else if(a[mid]>target) hi=mid-1;
            else if(a[mid]<target) lo=mid+1;
        }
        return lo-1;   
    }
    
    
    private static int binarySearch3(int[] a, int target){
    	int lo = 0;
        int hi = a.length-1;
        Arrays.sort(a);
        
        while(lo<hi){
            int mid = lo + (hi-lo)/2;
            if(a[mid] < target) lo=mid+1;
            else hi=mid;  
        }
        
        if(lo==hi && a[lo]==target)
        	return lo;
        
        return -1;
        
    }
    
    public static void main(String[] args){
        System.out.println(binarySearch3(new int[]{-2, -1, 0, 1, 2}, 2));
        System.out.println(binarySearch3(new int[]{-2, -1, 0, 2, 3}, 1));
        System.out.println(binarySearch(new int[]{0, 0, 0, 1, 1, 1, 1, 1, 1}, 1));
        System.out.println(binarySearch3(new int[]{0, 0, 0}, 0));
    }

}
