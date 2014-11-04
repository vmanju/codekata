import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Anagrams {
	
	private static void findAnagrams(List<String> dict){
	
		Map<String, List<String>> hash = new HashMap<>();
		
		for(String s: dict){
			char[] s_arr = s.toCharArray();
			Arrays.sort(s_arr);
			String key = String.valueOf(s_arr);
			List<String> list = null;
			if(!hash.containsKey(key))
				list = new ArrayList<String>();	
			else 
				list = hash.get(key);
			list.add(s);
			hash.put(key, list);	
			/*if(!hash.containsKey(key))
				hash.put(key, new ArrayList<String>());
			hash.get(key).add(s);*/
			
		}
		
		for(Map.Entry<String, List<String>> entry: hash.entrySet()){
			if(entry.getValue().size()>=2)
				//for(String s: entry.getValue())
				System.out.printf(Arrays.toString(entry.getValue().toArray()));	
		}
	}
	
	private static String randString(int len){
		StringBuilder ret = new StringBuilder();
		Random rnd = new Random();
		
		while(len-- > 0){
			ret.append((char)(rnd.nextInt(26)+97));
		}
		
		return ret.toString();
	}
	
	public static void main(String[] args) {
		/*List<String> list = new ArrayList<>();
		list.add("level");
		list.add("evell");
		findAnagrams(list);*/
		
		Random rnd = new Random();
		List<String> dict = new ArrayList<>();
		int n = rnd.nextInt(100000);
		Set<String> table = new HashSet<>();
		for(int i=0; i<n; i++)
			table.add(randString(rnd.nextInt(12)+1));
		for(String s: table)
			dict.add(s);
		
		findAnagrams(dict);
		
	}
}
