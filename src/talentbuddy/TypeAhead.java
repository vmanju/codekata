package talentbuddy;

public class TypeAhead {

	public static void typeahead(String[] usernames, String[] queries) {
        // Write your code here
        // To print results to the standard output please use System.out.println
        // Example: System.out.println("Hello world!");
        
        for(String query: queries){
            String match = null;
            for(String user: usernames){
                if(user.toLowerCase().startsWith(query.toLowerCase())){
                    if(match==null)
                        match = user;
                    else if(user.compareTo(match) < 0)
                        match = user;
                }
            }
            System.out.println(match==null? -1: match);
        }
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"james", "jBlank"};
		String[] queries = {"j", "jm", "jbl", "JB"};
		typeahead(names, queries);
		
	}

}
