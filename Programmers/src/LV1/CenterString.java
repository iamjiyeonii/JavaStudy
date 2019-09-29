package LV1;

public class CenterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "qwer";
		System.out.println(solution(s));

	}

	public static String solution(String s) {
	      String answer = "";
	       
	      if (s.length()%2 == 0) {
	    	  answer = s.substring(s.length()/2 - 1, s.length()/2 + 1);
	      }
	      else {
	    	  answer = s.substring(s.length()/2, s.length()/2 + 1);
	      }
	      return answer;
	      
	      //return (s.length()%2 == 0 ? s.substring(s.length()/2 - 1, s.length()/2 + 1) : s.substring(s.length()/2, s.length()/2 + 1));
	  }
}
