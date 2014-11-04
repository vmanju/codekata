import java.util.HashMap;
import java.util.Map;


public class AnonymousLetter {

	private static boolean canLBeWrittenUsingM(String L, String M){
		Map<Character, Integer> hash = new HashMap<>();
		for(char c: L.toCharArray()){
			if(!hash.containsKey(c))
				hash.put(c, 1);
			else
				hash.put(c, hash.get(c)+1);
			
		}
		
		for(char c: M.toCharArray()){
			if(hash.containsKey(c)){
				if(hash.get(c)==1)
					hash.remove(c);
				else
					hash.put(c, hash.get(c)-1);
			}
		}
		
		return hash.isEmpty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(canLBeWrittenUsingM("baab", "baa"));
		
		assert(!canLBeWrittenUsingM("baab", "baa"));
		//System.out.println("here");
		
	}

}
