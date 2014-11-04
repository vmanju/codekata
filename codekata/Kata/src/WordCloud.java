import java.util.HashMap;
import java.util.Map;


public class WordCloud {

	private static Map<String, Integer> buildLookupTable(String str){
		if(str==null || !str.contains(" ")) return null;
		String[] a = str.split(" ");
		Map<String, Integer> table = new HashMap<>();

		for(String s: a){
			String lowerCaseString = s.toLowerCase().replaceAll("\\p{P}+", "");
			
			if(!table.containsKey(lowerCaseString))
				table.put(lowerCaseString, 1);
			else
				table.put(lowerCaseString, table.get(lowerCaseString)+1);
		}
		return table;
	}
	
	private static Map<String, Integer> buildLookupTable2(String str){
		if(str==null || !str.contains(" ")) return null;
		char[] s = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		Map<String, Integer> table = new HashMap<>();
		
		for(char c: s){
			
			if(!Character.isWhitespace(c) && Character.isLetter(c)){
				sb.append(c);
			} else {
				String lowerCaseString = sb.toString().toLowerCase();
				
				if(!table.containsKey(lowerCaseString))
					table.put(lowerCaseString, 1);
				else
					table.put(lowerCaseString, table.get(lowerCaseString)+1);	
				
				sb = new StringBuilder();
			}
		}
		
		return table;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = buildLookupTable2("After beating the eggs, Dana read the next step:");
		for(Map.Entry<String, Integer> entry: map.entrySet())
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		
		map = buildLookupTable2("We came, we saw, we conquered...then we ate Bill's (Mille-Feuille) cake.");
		for(Map.Entry<String, Integer> entry: map.entrySet())
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
	}

}
