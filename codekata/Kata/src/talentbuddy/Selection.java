package talentbuddy;

import java.util.PriorityQueue;

public class Selection {

	public static void selectNumbers(Integer[] v, Integer k) {
        // Write your code here
        // To print results to the standard output please use System.out.println
        // Example: System.out.println("Hello world!");
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i: v)
            queue.add(i);
        
        for(int i=0; i<k && i<queue.size(); i++)
            System.out.println(queue.poll());
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 2;
		Integer[] v = {1, 2, 8, 7, 3, 3, 1};
		selectNumbers(v,k);
	}

}
