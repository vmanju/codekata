package recursion;

import java.util.Arrays;

public class ReverseArray {

	public static void reverse(int[] arr,int first,int last) {
	    if(first > last)
	        return;
	    
	    swap(first++,last--,arr);
	    reverse(arr, first, last);
	}
	
	public static void swap(int first,int last,int[] arr) {
	    int temp = arr[first];
	    arr[first] = arr[last];
	    arr[last] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		reverse(arr,0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
