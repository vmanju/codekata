package math;
/**
 * Finding primes upto n, using sieve of eratosthenes method
 * @author manju.vijayakumar
 *
 */
public class Primes {

	private static boolean[] sieve(int n){
		boolean[] primes = new boolean[n+1];
		
		for(int i=2; i<primes.length; i++)
			primes[i] = true;
		
		for(int k = 2; k<Math.sqrt(n);){
			crossOff(primes, k);
			k = getNextPrime(primes, k);
		}
		return primes;
	}
	
	private static void crossOff(boolean[] primes, int k){
		for(int i=k*k; i<primes.length; i+=k)
			primes[i] = false;
	}
	
	private static int getNextPrime(boolean[] primes, int k){
		for(int i=k+1; i<primes.length; i++)
			if(primes[i]) return i;
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] primes = sieve(20);
		for(int i=0; i<primes.length; i++)
			if(primes[i]) System.out.printf("%d ", i);
	}

}
