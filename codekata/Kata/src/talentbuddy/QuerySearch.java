package talentbuddy;

public class QuerySearch {
	
	public static void searchQuery(String[] query, String[] pages) {
		int count = 0;
        for(String page: pages) {
            int index = -1;
            for(String s: query) {
                index = page.indexOf(s);
                
                // if string not found in page
                if(index < 0) break;
                
                // if string found in page
                // then substring it for next iteration
                // since we want to find subsequent strings
                // later in the page
                page = page.substring(index);
            }
            if(index>0) count++;
        }
        
        System.out.println(count);     
    }
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] query = {"the", "new", "store"};
		String[] pages = {"the new store is in san francisco", "the boy enters a new and cool store", "this boy enters a new store", "The new store is in the city", "the newstore is a brand", "there is newton in the store"};
		searchQuery(query, pages);
	}

}
