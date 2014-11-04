package ds;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinPQ {

    private int size;
    private int[] a;
    
    public MinPQ(int capacity){
        this.a = new int[capacity];
    }
    
    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    private static void sink(int[] a, int k, int n) {
        while(2*k+1 <= n) {
            int j = 2*k+1;
            if(j<n && a[j]>a[j+1]) j++;
            if(a[k] > a[j]) swap(a, k, j);
            k = j;
        }   
    }
    
    private static void swim(int[] a, int k, int n) {
    	while(k>0 && a[(k-1)/2] > a[k]){
    		swap(a, (k-1)/2, k);
    		k = (k-1)/2;
    	}
    }
    
    private void insert(int num) {
        if(size > a.length) return;     
        a[size++] = num;
        int k = size-1;
        swim(a,k,k);
    }
    
    private void removeMin(){
        a[0] = a[size-1];
        size--;
        sink(a, 0, size-1);
    }
    
    private boolean isMinHeap(int k){
    	if(k>size) return true;
    	int left = 2*k + 1;
    	int right = 2*k + 2;
    	if(left< size && a[k]>a[left]) return false;
    	if(right< size && a[k]>a[right]) return false;
    	
    	return isMinHeap(left) && isMinHeap(right);
    }
    
    public String toString(){
        StringBuffer buff = new StringBuffer();
        for(int i=0; i<size; i++) buff.append(a[i] + " ");
        return buff.toString();
    }
    
    public static void main(String[] args){
        MinPQ pq = new MinPQ(6);
        int[] a = new int[]{2,4,3,1,5,0};
        for(int element: a) pq.insert(element);
        System.out.println(pq.toString());
        pq.removeMin();
        System.out.println(pq.toString());
        pq.removeMin();
        pq.insert(0);
        System.out.println(pq.toString());
        
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(10, Collections.reverseOrder());
        for(int i: a)
        	q.add(i);
        while(!q.isEmpty()){
        	System.out.println(q.poll());
        }
        
        System.out.println(pq.isMinHeap(0));
     
    }

}
