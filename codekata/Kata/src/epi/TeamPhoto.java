package epi;

import java.util.Arrays;

public class TeamPhoto {

	public static boolean canArrangeTeamPhoto(Integer[] a, Integer[] b){

	    if(a.length != b.length) 
	        return false;
	    
	    Arrays.sort(a);
	    Arrays.sort(b);

	    //TODO
	    return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[]{1, 2, 3};
		int[] b = new int[] {4, 5, 6};
		
		
	}

}
