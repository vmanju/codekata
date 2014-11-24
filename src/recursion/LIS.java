package recursion;

public class LIS {

	// longest increasing subseq
	private static void lis(int[] a){
		int n = a.length;
		int[] lis = new int[n];
		for(int i=0; i<n; i++)
			lis[i] = 1;
		int max = 1;
		for(int i=1; i<n; i++){
			for(int j=0; j<i; j++){
				if( a[i]>a[j] && lis[i] < (lis[j]+1) )
					lis[i] = lis[j]+1;
			}
			if(max < lis[i])
				max = lis[i];
		}
					
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		lis(new int[]{10,22,9,33,21,50,41,60, 80});
	}

}
