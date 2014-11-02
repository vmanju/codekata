package talentbuddy;

public class RelativeSort {

	public static void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void relativeSort(Integer[] v) {
        int i=0, j=i+i, k=0;
        
        while(i<v.length && j<v.length){
            if(v[i]<0) i++;
            else if(v[i]>=0) {
                if(v[j]<0){
                    swap(v, i++, j);
                    k = i;
                    while(j>k)
                        swap(v, k++, j);
                }
            }
            j++;
        }
        
       for(int num: v) System.out.printf("%d ", num);
    }
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		relativeSort(new Integer[]{-5, 2, 1, -2, 3});

	}

}
