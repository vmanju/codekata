
public class MaxProfit {

	private static int maxProfit(int[] arr){
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
				max = min;
			}
			if(arr[i]>max)
				max= arr[i];
				
		}
		
		return max-min;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//assertEquals(maxProfit(new int[]{5,2,0,1,2,3}),3);
		System.out.println(maxProfit(new int[]{5,2,0,1,2,3}));
		System.out.println(maxProfit(new int[]{1,2,0,1,5,3}));

	}

}
