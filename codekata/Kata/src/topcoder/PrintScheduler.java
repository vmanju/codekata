package topcoder;

public class PrintScheduler {

	public static String getOutput(String[] threads, String[] slices){

	    int m = slices.length;
	    int[] pos = new int[threads.length];
	    StringBuilder ret = new StringBuilder();
	    for(int i=0; i<m; i++){
	    	String[] toks = slices[i].split(" ");
	        int threadNum = Integer.valueOf(toks[0]);
	        int time = Integer.valueOf(toks[1]);
	        String s = threads[threadNum];
	       
	        while(time-- > 0){
	            ret.append(s.charAt(pos[threadNum]++ % s.length()));    
	        }
	    }
	    return ret.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] threads = {"AB","CD"};
		String[] slices = {"0 1","1 1","0 1","1 2"};
		System.out.println(getOutput(threads, slices));
	}

}
