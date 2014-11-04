package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS {
	private final int s;
	private boolean[] marked;
	private int[] edgeTo;
	private int[] distTo;
	
	public BFS(Graph G, int s){
		this.s = s;
		edgeTo = new int[G.V()];
		marked = new boolean[G.V()];
		distTo = new int[G.V()];
		bfs(G,s);
	}
	
	private void bfs(Graph G, int s){
		Queue<Integer> queue = new LinkedList<>();
		marked[s] = true;
		queue.add(s);
		while(!queue.isEmpty()){
			int v = queue.poll();
			for(int w: G.adj(v)){
				if(!marked[w]){
					edgeTo[w] = v;
					marked[w] = true;
					distTo[w] = distTo[v]+1;
					queue.add(w);
				}
			}
		}
	}
	
	public boolean hasPathTo(int v){
		return marked[v];
	}
	
	public int distTo(int v){
		return distTo[v];
	}
	
	public Iterable<Integer> pathTo(int v){
		if(!hasPathTo(v)) return null;
		Stack<Integer> path = new Stack<>();
		int x = v;
		for(;distTo[x]!=0; x = edgeTo[x]){
			path.push(x);
		}
		path.push(x);
		return path;
	}

}
