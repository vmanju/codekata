package topcoder;

public class TrafficCongestionDivTwo {


	public static long sumOddSeries(int n) {
	    long sum = 0;
	    for(int i=2; i<n; i+=2){
	        sum+=Math.pow(2,i);
	    } 
	    return sum;
	}
	
	public static  long sumEvenSeries(int n){
	    long sum = 0;
	    for(int i=1; i<n; i+=2){
	        sum+=Math.pow(2,i);
	    } 
	    return sum;
	}
	
	
	public static long minCars(int height) {
		//if(height==1) return 1;
		
	    // if height is odd
	    if(height % 2 != 0){
	        return 1 + sumOddSeries(height);
	    }
	    return 1 + sumEvenSeries(height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minCars(1));
		System.out.println(minCars(2));
		System.out.println(minCars(3));
		System.out.println(minCars(11));
		System.out.println(minCars(60));
	}

}
