package recursion;

public class IntToBin {
	
	private static void intToBin(int n){
		if(n==0) return;
		intToBin(n/2);
		System.out.print(n%2);
	}
	
	public static void main(String[] args){
		intToBin(14);
	}

}
