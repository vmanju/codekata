package recursion;

import java.util.Arrays;

public class Ladder {

	private static int count(int k, int[] a){
		if(k==0) return 1;
		else if(k<0) return 0;
		else if(a[k] > 0) return a[k];
		else {
			int maxModulo = (int) Math.pow(2, 30);
			a[k] = (count(k-1, a) % maxModulo) + (count(k-2, a) % maxModulo);
			return a[k];
		}    
    }
	
    public static int[] solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int[] result = new int[A.length];
        
        for(int i=0; i<A.length; i++){
        	int[] a = new int[A[i]+1];
            result[i] = count(A[i], a) % (int) Math.pow(2, B[i]);
        }
        return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {4,4,5,5,1};
		int[] B = {3,2,4,3,1};
		System.out.println(Arrays.toString(solution(A,B)));
	}

}
