package fundamentals;

import java.util.Arrays;

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
    
    
    public static void main(String[] args){
        printThreeSumPairs(new int[]{-2, -1, 0, 1, 2});
    }

}
