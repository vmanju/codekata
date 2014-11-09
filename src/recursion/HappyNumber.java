package recursion;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	private static int getNextNum(int n){
		int sum = 0;
		while(n>0){
			sum+= ((n % 10) * (n % 10));
			n/=10;
		}
		return sum;
	}
	
	/*private static boolean isHappy(int n){
		Set<Integer> s = new HashSet<>();
		while(n>1 && !s.contains(n)){
			s.add(n);
			n = getNextNum(n);
		}
		return n==1;
	}*/
	
	private static boolean isHappy(int n, Set<Integer> s){
		if(n==1) return true;
		
		if(!s.contains(n)){
			s.add(n);
			n = getNextNum(n);
		}
		
		return isHappy(n, s);
	}
	
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		System.out.println(isHappy(19, s));
	}

}
