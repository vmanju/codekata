package topcoder;

public class ArrayHash {

	public static int getHash(String[] input) {	    
	    int sum = 0;
	    
	    for(int i=0; i<input.length; i++){
	        char[] a = input[i].toCharArray();
	        for(int j=0; j<a.length; j++) {
	            sum+= (a[j] - 'A') + i + j;
	        }
	    }
	    return sum;
	}
	
	public static void main(String[] args) {
		String[] input = new String[] {"CBA", "DDD"};
		input = new String[] {"Z"};
		input = new String[] {"A",
				 "B",
				 "C",
				 "D",
				 "E",
				 "F"};
		
		input = new String[]{"ABCDEFGHIJKLMNOPQRSTUVWXYZ",
			 "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
			 "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
			 "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
			 "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
			 "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};

		input = new String[] {"ZZZZZZZZZZ"};
		System.out.println(getHash(input));
	}
}
