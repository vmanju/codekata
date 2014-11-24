package interviewcake;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Permutation {
	
	private static void Permute(String prefix, String s){
	
		if(s.length()==0) System.out.println(prefix);
		
		for(int i=0; i<s.length(); i++){
			Permute(prefix + s.charAt(i), s.substring(0,i) + s.substring(i+1));
		}
		
	}
	
	private static void PermuteK(String prefix, String s, int k){
		if(k==0) System.out.println(prefix);
		
		for(int i=0; i<s.length(); i++){
			PermuteK(prefix + s.charAt(i), s.substring(0,i) + s.substring(i+1), k-1);
		}
		
	}
	
	// Permutations with duplicates
	private static Set<String> PermuteDupe(String prefix, String s, Set<String> set){
		
		if(s.length()==0) {
			//System.out.println(prefix);
			set.add(prefix);
		}
		
		for(int i=0; i<s.length(); i++){
			PermuteDupe(prefix + s.charAt(i), s.substring(0,i) + s.substring(i+1), set);
		}
		
		return set;
		
	}
	
	private static void PermuteDupe(String prefix, String s){
		if(s.length()==0) {
			System.out.println(prefix);
		}
		
		for(int i=0; i<s.length(); i++){
			if(i>0){
				if(s.charAt(i) == s.charAt(i-1))
					continue;
			} 	
			PermuteDupe(prefix + s.charAt(i), s.substring(0,i) + s.substring(i+1));
		}
	}
	
	public static void main(String[] args) {
		//Permute("", "cats");
		//PermuteK("", "cats", 2);
		//Set<String> set = PermuteDupe("", "baa", new HashSet<String>());
		//System.out.println(set.toString());
		
		String s = "baa";
		char[] c = s.toCharArray();
		Arrays.sort(c);
		PermuteDupe("", String.valueOf(c));
	}
}
