package talentbuddy;

public class CountOccurrences {

	public static int count(Integer[] v, int lo, int hi, int k){
        if(lo>hi)
            return 0;
        
        int mid = lo + (hi-lo)/2;
        if(v[mid]==k)
            return 1 + count(v,lo,mid-1,k) + count(v,mid+1,hi,k);
        else if(v[mid]>k)
            return count(v,lo,mid-1,k);
        else
            return count(v,mid+1,hi,k);
    }
    
    public static void countOccurences(Integer[] v, Integer k) {
        // Write your code here
        // To print results to the standard output please use System.out.println
        // Example: System.out.println("Hello world!");
        int result = count(v, 0, v.length-1, k);
        System.out.println(result);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] v = {1, 2, 3, 3, 3, 3, 4, 4};
		int k = 3;
		countOccurences(v,k);
	}

}
