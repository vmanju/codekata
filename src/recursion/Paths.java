package recursion;

public class Paths {

	// Returns count of possible paths to reach cell at row number m and column
	// number n from the topmost leftmost cell (cell at 1, 1)
	
	// O(2^n)
	private static int  numberOfPaths(int m, int n)
	{
	   // If either given row number is first or given column number is first
	   if (m == 1 || n == 1)
	        return 1;
	 
	   // If diagonal movements are allowed then the last addition
	   // is required.
	   return  numberOfPaths(m-1, n) + numberOfPaths(m, n-1); 
	           // + numberOfPaths(m-1,n-1);
	}
	
	// O(mn)
	private static int numberOfPaths2(int m, int n){
	
		int[][] count = new int[m][n];
		
		for(int i=0; i<m; i++)
			count[i][0] = 1;
		
		for(int j=0; j<n; j++)
			count[0][j] = 1;
		
		for(int i=1; i<m; i++)
			for(int j=1; j<n; j++)
				count[i][j] = count[i-1][j] + count[i][j-1];
		
		return count[m-1][n-1];
	}
	
	public static void main(String[] args) {
		System.out.println(numberOfPaths(3,3));
		System.out.println(numberOfPaths2(3,3));
	}

}
