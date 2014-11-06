package interviewcake;

public class FindUnique {

	private static int findUnique(int[] ids){
		int unique_id = 0;
		
		for(int id: ids){
			unique_id ^= id;
		}
		return unique_id;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ids = {1,1,2,2,3,4,4,0,0};
		System.out.println(findUnique(ids));
	}

}
