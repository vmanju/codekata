package fundamentals;


public class SearchRotatedArray {

	/* Searches an element no in a pivoted sorted array arrp[]
	   of size arr_size */
	private static int pivotedBinarySearch(int arr[], int no)
	{
	   int pivot = findPivot(arr, 0, arr.length-1);
	 
	   // If we didn't find a pivot, then array is not rotated at all
	   if (pivot == -1)
	     return binarySearch(arr, 0, arr.length-1, no);
	 
	   // If we found a pivot, then first compare with pivot and then
	   // search in two subarrays around pivot
	   if (arr[pivot] == no)
	     return pivot;
	   if (arr[0] <= no)
	     return binarySearch(arr, 0, pivot-1, no);
	   else
	     return binarySearch(arr, pivot+1, arr.length-1, no);
	}
	 
	/* Function to get pivot. For array 3, 4, 5, 6, 1, 2 it will
	   return 3. If array is not rotated at all, then it returns -1 */
	private static int findPivot(int arr[], int low, int high){
	   // base cases
	   if (high < low)  return -1;
	   if (high == low) return low;
	 
	   int mid = low + (high-low)/2;   
	   if (mid < high && arr[mid] > arr[mid + 1])
	     return mid;
	   if (mid > low && arr[mid] < arr[mid - 1])
	     return (mid-1);
	   if (arr[low] >= arr[mid])
	     return findPivot(arr, low, mid-1);
	   else
	     return findPivot(arr, mid + 1, high);
	}
	
	private static int binarySearch(int[] a, int lo, int hi, int target){
        while(lo<hi){
            int mid = lo + (hi-lo)/2;
            if(a[mid] < target) lo=mid+1;
            else hi=mid;  
        }
        
        if(lo==hi && a[lo]==target)
        	return lo;
        
        return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(pivotedBinarySearch(new int[]{4,5,6,2,2,3}, 2));
	}

}
