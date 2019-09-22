package LV1;

public class watermelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solution(1));
	}
	
	public static String solution(int n) {
	      String answer = "";
	      
	      int num = n/2;
	      int mod = n%2;
	      
	      for (int i = 0; i < num; i++) 
	    	  answer += "수박";
	      
	      if (mod == 1) answer += "수";
	      
	      return answer;
	  }

}
