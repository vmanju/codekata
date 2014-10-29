package topcoder;

public class WolfDelaymaster {

	private static String check(String str){
		int i = 0;
		int len = str.length();
		
		while(i<len){
			
			if(str.charAt(i) != 'w') 
				return "INVALID";
			
			int count = 0;
			while(i<len && str.charAt(i) == 'w'){
				count++; i++;
			}
			
			char[] chars = {'o', 'l', 'f'};
			for(char c: chars){
				int tmp = count;
				while(tmp-- > 0){
					if(i>len || c != str.charAt(i))
						return "INVALID";
					i++;
				}
			}
		}
		return "VALID";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(check("wolf"));
		System.out.println(check("wwolfolf"));
		System.out.println(check("wolfwwoollffwwwooolllfffwwwwoooollllffff"));
		System.out.println(check("flowolf"));
		System.out.println(check("wooolll"));
	}

}
