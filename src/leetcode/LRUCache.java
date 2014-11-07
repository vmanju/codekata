package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * LRU Cache implemented via a hashmap
 * containing keys
 * @author arun.varadarajan
 *
 */
public class LRUCache {

	private int capacity;
	private int len;
	private Map<Integer, DoubleLinkedListNode> map;
	private DoubleLinkedListNode head, end;
	
	public LRUCache(int capacity){
		this.capacity = capacity;
		this.len = 0;
		map = new HashMap<>();	
	}
	
	public void setHead(DoubleLinkedListNode node){
		// Set the current head's prev to point to latest node
		if(head!=null)
			head.pre = node;
		
		// Reset the head to the latest node
		node.next = head;
		node.pre = null;
		head = node;
		
		// If the cache is empty, then point end to head
		if(end==null)
			end = node;
	}
	
	public void removeNode(DoubleLinkedListNode node){
		// Remove a node from cache and reset 
		// its neighboring nodes
		DoubleLinkedListNode prev = node.pre;
		DoubleLinkedListNode next = node.next;
		
		if(prev!=null)
			prev.next = next;
		else
			head = next;
		
		if(next!=null)
			next.pre = prev;
		else
			end = prev;
	}
	
	// O(1) access
	public int get(int key){
		// If cache contains key, then get the node
		// remove this node and move it to front of cache
		// i.e make it head node
		if(map.containsKey(key)){
			DoubleLinkedListNode latest = map.get(key);
			removeNode(latest);
			setHead(latest);
			return latest.val;
		}
		// If cache doesn't contain key, return -1
		return -1;
	}
	
	
	// O(1) set
	public void set(int key, int value){
		// if cache contains the key, then just update its value
		// and move it to the head
		if(map.containsKey(key)){
			DoubleLinkedListNode node = map.get(key);
			node.val = value;
			removeNode(node);
			setHead(node);		
		} else {
			DoubleLinkedListNode newNode = 
					new DoubleLinkedListNode(key, value);
			
			// if cache overflows, then
			// remove the key from cache
			// and the end node (i.e least recently used key)
			if(len >= capacity){
				map.remove(end.key);
				removeNode(end);
			} else {
				len++; // else just increment the len of cache
			}
			// Put the new key into cache
			// and move it to the head
			setHead(newNode);
			map.put(key, newNode);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LRUCache cache = new LRUCache(3);
		cache.set(1, 10);
		cache.set(2, 20);
		cache.set(3, 30);
		System.out.println(cache.len);
		cache.get(1);
		cache.get(3);
		cache.set(4, 40);
		cache.set(5, 50);
		System.out.println(cache.len);
		System.out.println(cache.get(2));
	}
}

class DoubleLinkedListNode {
	public int val;
	public int key;
	public DoubleLinkedListNode pre;
	public DoubleLinkedListNode next;
 
	public DoubleLinkedListNode(int key, int value) {
		val = value;
		this.key = key;
	}
}
