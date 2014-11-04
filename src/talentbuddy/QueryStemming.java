package talentbuddy;

import java.util.Arrays;
import java.util.Comparator;

public class QueryStemming {

	public static void tokenStemming(String[] tokens, String[] suffixes) {
        // Write your code here
        // To print results to the standard output please use System.out.println
        // Example: System.out.println("Hello world!");
        Arrays.sort(suffixes, new Comparator<String>(){
            public int compare(String s1, String s2){
                return s2.length() - s1.length();
            }
        });
        
        for(String s: tokens){
            boolean tokenized = false;
            for(String suf: suffixes) {
                if(s.endsWith(suf)){
                    System.out.println(s.substring(0,s.lastIndexOf(suf)));
                    tokenized = true;
                    break;
                }
            }
            if(!tokenized)
                System.out.println(s);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] tokens =  
			{"10", "times", "a", "year", "IEN", "Italia", "provides", "a", "digest", "of", "the", "latest", "products", "news", "and", "technologies", "available", "on", "the", "Italian", "market", "In", "2009", "nearly", "14", "000", "subscribers", "received", "IEN", "Italia", "mostly", "engineers", "and", "purchasing", "managers", "IEN", "Italia", "also", "publishes", "newsletters", "and", "updates", "its", "website", "with", "daily", "news", "about", "new", "products", "and", "services", "available", "to", "the", "Italian", "market"};
		String[] suffixes = {"es", "a", "est", "le", "n", "e", "09", "rly", "ved", "lia", "rs", "ers", "N", "ia", "so", "s", "ters", "nd", "th", "ws", "w", "ts", "d"};
		
		tokenStemming(tokens, suffixes);
	}

}
