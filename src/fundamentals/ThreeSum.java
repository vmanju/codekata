package fundamentals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThreeSum {

    private static void printThreeSumPairs(int[] a){
        int n = a.length;
        Arrays.sort(a);
        for(int i=0; i<n; i++)
            for(int j=i+1; j<n; j++){
                int k = Arrays.binarySearch(a, -(a[i]+a[j]));
                if(k>j) System.out.printf("%s: %d, %d, %d\n", "Pair", a[i],a[j],a[k]);
            }
    }
    
    private static void printThreeSumPairs2(int[] a){
    	int n = a.length;
    	Arrays.sort(a);
    	Map<Integer, Integer> map = new HashMap<>();
    	for(int i=0; i<n; i++)
    		map.put(a[i], i);
    	for(int i=0; i<n; i++){
    		for(int j=i+1; j<n; j++){
    			int sum = -(a[i] + a[j]);
    			if(map.containsKey(sum) && map.get(sum)>j)
    				System.out.printf("%s: %d, %d, %d\n", "Pair", a[i],a[j], sum);
    		}
    	}
    }
    
    private static void printThreeSumPairs3(int[] s){
    	int n = s.length;
    	Arrays.sort(s);
    	for(int i=0; i<n-2; i++){
    		int a = s[i];
    		int start = i+1;
    		int end = n-1;
    		while(start<end){
    			int b = s[start];
    			int c = s[end];
    			if(a+b+c == 0){
    				System.out.printf("%s: %d, %d, %d\n", "Pair", a,b,c);
    				start = start+1; end = end -1;
    			}
    			else if(a+b+c>0)
    				end = end -1;
    			else
    				start=start+1;
    				
    		}
    	}
    }
    
    public static void main(String[] args){
        //printThreeSumPairs(new int[]{-2, -1, 0, 1, 2});
        printThreeSumPairs2(new int[]{2, 3, 1, -2, -1, 0, 2, -3, 0});
    }

}
