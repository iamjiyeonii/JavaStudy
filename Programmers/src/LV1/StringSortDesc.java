package LV1;

import java.util.*;

public class StringSortDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Zbcdefg";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
	    String answer = "";
	
	    List<String> list = new ArrayList<>();
	    
	    for (int i = 0; i < s.length(); i++) {
	    	list.add(Character.toString(s.charAt(i)));
	    }
	    
	    Collections.sort(list, Comparator.reverseOrder());
	    
	    for (String str : list)
	    	answer += str;
	    
	    return answer;
	}
}
