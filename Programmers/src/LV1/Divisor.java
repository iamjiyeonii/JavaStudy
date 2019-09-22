package LV1;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solution(5));
	}

	public static int solution(int n) {
	      int answer = 0;
	      
	      for (int i = 1; i <= n; i++) {
	    	  if (n%i == 0) answer += i;
	      }
	      
	      return answer;
	  }
}
