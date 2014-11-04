package graph;

import java.util.Stack;

public class DFS {

	private final int s;
	private boolean[] marked;
	private int[] edgeTo;
	
	// Computes a path between s and every other vertex in graph
	public DFS(Graph G, int source){
		this.s  = source;
		edgeTo = new int[G.V()];
		marked = new boolean[G.V()];
		dfs(G, s);
	}
	
	// Depth first search from v
	private void dfs(Graph G, int v){
		marked[v] = true;
		for(int w: G.adj(v)){
			if(!marked[w]){
				edgeTo[w] = v;
				dfs(G, w);
			}
		}
	}
	
	public boolean hasPathTo(int v){
		return marked[v];
	}
	
	public Iterable<Integer> pathTo(int v){
		if(!hasPathTo(v)) return null;
		
		Stack<Integer> path = new Stack<>();
		for(int x = v; x!=s; x=edgeTo[x])
			path.push(x);
		path.push(s);
		return path;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
