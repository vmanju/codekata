package talentbuddy;

import java.math.BigInteger;

public class FastPower {

	public static BigInteger power(Integer a, Integer b){
        if(b==1) return BigInteger.valueOf(a);
        
        if(b%2==0)
            return power(a, b/2).multiply(power(a, b/2));
        else
            return power(a, b/2).multiply(power(a, b/2)).multiply(BigInteger.valueOf(a));
    }
    
    public static void fastPower(Integer[] a, Integer[] b) {
        for(int i=0, j=0; i<a.length && j<b.length; i++,j++){
            System.out.println(power(a[i], b[j]).mod(BigInteger.valueOf(4211)));
        }
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a = {19244, 42831, 25083, 37087};
		Integer[] b = {8, 5, 8, 5};
		
		//fastPower(a, b);
		
		a = new Integer[] {41619, 169, 29227, 13232};
		b = new Integer[] {6, 5, 7, 8};
		
		fastPower(a, b);
		
	}

}
