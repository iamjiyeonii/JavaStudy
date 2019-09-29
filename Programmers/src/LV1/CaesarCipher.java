package LV1;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "a B z";
		int n = 4;
		System.out.println(solution(s,n));
	}

	public static String solution(String s, int n) {
	      String answer = "";
	      
	      for (int i = 0; i < s.length(); i++) {
	    	  if (s.charAt(i) == ' ') 
	    		  answer += Character.toString(s.charAt(i));
	    	  else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
	    		  if (s.charAt(i) + n > '9')
	    			  answer += Character.toString(s.charAt(i) - 10 + n);
	    		  else
	    			  answer += Character.toString(s.charAt(i) + n);
	    	  }
	    	  else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {		// Character.isUpperCase(s.charAt(i))
	    		  if (s.charAt(i) + n > 'Z')
	    			  answer += Character.toString(s.charAt(i) - 26 + n);
	    		  else
	    			  answer += Character.toString(s.charAt(i) + n);
	    	  }
	    	  else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {		 // Character.isLowerCase(s.charAt(i))
	    		  if (s.charAt(i) + n > 'z')
	    			  answer += Character.toString(s.charAt(i) - 26 + n);
	    		  else
	    			  answer += Character.toString(s.charAt(i) + n);
	    	  }
	    	 
	      }
	      return answer;
	  }
}
