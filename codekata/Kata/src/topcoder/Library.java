package topcoder;

import java.util.HashSet;
import java.util.Set;

public class Library {

	private static int documentAccess(String[] records, String[] userGroups, String[] roomRights){
		
		// agent has no access to groups or rooms
		if(roomRights.length==0 || userGroups.length == 0){
			return 0;
		}
				
		Set<String> docs = new HashSet<>();
		Set<String> groups = new HashSet<>();
		Set<String> rooms = new HashSet<>();
		
		for(String group: userGroups)
			groups.add(group);
		
		for(String room: roomRights)
			rooms.add(room);

		for(String record: records){
			String[] rec = record.split(" ");
			String doc = rec[0];
			String room = rec[1];
			String group = rec[2];
			
			if(rooms.contains(room) && groups.contains(group)){
				docs.add(doc);
			}
			
		}
		
		return docs.size();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] docs = {"diary computers editor","fairytale gardening editor","comix cars author","comix cars librarian"};
		String[] groups = {"employee","editor","author"};
		String[] rooms = {"history","cars","computers"};
		System.out.println(documentAccess(docs, groups, rooms));
		
		
		String[] docs1 = {"diary computers editor","fairytale gardening editor","comix cars author","comix cars librarian"};
		String[] groups1 = {"employee","editor","author","librarian"};
		String[] rooms1 = {"history","cars","computers"};
		
		System.out.println(documentAccess(docs1, groups1, rooms1));
		
		
		String[] docs2 ={"diary computers editor","fairytale gardening editor","comix cars author","comix cars librarian"};
		String[] groups2 = {"employee","editor","author","librarian"};
		String[] rooms2 = {};
		
		System.out.println(documentAccess(docs2, groups2, rooms2));
		
		String[] docs3 ={"a b c","a b d","b b c","b b d","e c d","e c b","e c c","t d e"};
		String[] groups3 ={"c","d","x"};
		String[] rooms3 = {"a","b","c"};
		
		System.out.println(documentAccess(docs3, groups3, rooms3));
		
		
	}

}
