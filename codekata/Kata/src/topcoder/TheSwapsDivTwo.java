package topcoder;

public class TheSwapsDivTwo {

	private static int find(int[] seq){

	    int n = seq.length;
	    int count = 0, dupCount = 0;
	    for(int i=0; i<n-1; i++) {
	        for(int j=i+1; j<n; j++) {
	            if(seq[i] == seq[j])
	                dupCount = 1;
	            else
	                count++;
	        }
	    }
	    
	    return count + dupCount;
	    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] seq = new int[] {4, 7, 4};
		System.out.println(find(seq));
		seq = new int[] {1, 47};
		System.out.println(find(seq));
		seq = new int[] {9, 9, 9, 9};
		System.out.println(find(seq));
		seq = new int[] {22, 16, 36, 35, 14, 9, 33, 6, 28, 12, 18, 14, 47, 46, 29, 22, 14, 17, 4, 15, 28, 6, 39, 24, 47, 37};
		System.out.println(find(seq));
	}

}
