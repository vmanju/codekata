package topcoder;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SerialNumbers {

	private static int sum_of_digits(String s){
		int sum = 0;
		for(char c: s.toCharArray()){
			if(Character.isDigit(c)) sum+=c;
		}
		return sum;
	}
	
	private static Comparator<String> serialNumComparator = 
			new Comparator<String>(){

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					if(o1.length() != o2.length()){
						return o1.length() - o2.length();
					} 
					if(sum_of_digits(o1) != sum_of_digits(o2))
						return sum_of_digits(o1) - sum_of_digits(o2);
					
					return o1.compareTo(o2);
				}
		
	};
	
	private static String[] serialNumbers(String[] serialNumbers){
		List<String> serialNums = Arrays.asList(serialNumbers);
		Collections.sort(serialNums, serialNumComparator);
		return (String[]) serialNums.toArray();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nums = new String[]{"ABCD","145C","A","A910","Z321"};
		System.out.println(Arrays.toString(serialNumbers(nums)));
		
		nums = new String[]{"Z19", "Z20"};
		System.out.println(Arrays.toString(serialNumbers(nums)));
		
		nums = new String[] {"34H2BJS6N","PIM12MD7RCOLWW09","PYF1J14TF","FIPJOTEA5"};
		System.out.println(Arrays.toString(serialNumbers(nums)));
		
		nums = new String[] {"ABCDE", "BCDEF", "ABCDA", "BAAAA", "ACAAA"};
		System.out.println(Arrays.toString(serialNumbers(nums)));

		

	}
	
	

}
