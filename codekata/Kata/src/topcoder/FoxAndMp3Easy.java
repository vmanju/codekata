package topcoder;

import java.util.Arrays;

public class FoxAndMp3Easy {

	private static String[] playList(int n){
		String[] temp = new String[n];
		for(int i=1; i<=n; i++)
			temp[i-1] = i + ".mp3";
		
		Arrays.sort(temp);
		String[] res = new String[Math.min(50,n)];
		for(int i=0; i<res.length; i++)
			res[i] = temp[i];
		
		
		return res;
	}
	
	public static void main(String[] args) {
		//String[] s = new String[]{"1", "2", "10"};
		//Arrays.sort(s);
		//System.out.println(Arrays.toString(s));
		
		System.out.println(Arrays.toString(playList(100)));
	}
}
