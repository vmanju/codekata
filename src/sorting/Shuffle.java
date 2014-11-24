package sorting;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {

	private static void swap(int[] a, int i, int j){
		if(i!=j) {
			a[i] ^= a[j];
			a[j] ^= a[i];
			a[i] ^= a[j];
		}
	}
	
	private static void shuffle(int[] a){
		int n = a.length;
		Random rnd = new Random();
		for(int i=n-1; i>0; i--){
			int j = rnd.nextInt(i+1);
			swap(a, i, j);
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4};
		shuffle(a);
	}

}
