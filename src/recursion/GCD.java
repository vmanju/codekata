package recursion;

public class GCD {

    private static int gcd(int p, int q){
    	if(p<0 || q<0) return 0;
        if(q==0) return p;
        return gcd(q, p%q);
    }
    
    private static int gcd2(int p, int q){
    	while(q!=0){
    		int tmp = q;
    		q = p%q;
    		p = tmp;
    	}
    	return p;
    }
    
    
    public static void main(String[] args){
        System.out.println(gcd2(8, 12));
        System.out.println(gcd(8, 12));
        System.out.println(gcd(0, 0));
        System.out.println(gcd(-12, 12));
        System.out.println(gcd('a', 'b'));
        System.out.println(gcd(1440, 408));
    }

}