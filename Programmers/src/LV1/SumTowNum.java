package LV1;

public class SumTowNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3;
		int b = 3;
		System.out.println(solution(a,b));
	}
	
	public static long solution(int a, int b) {
	      long answer = 0;
	      
//	      int min = 0;
//	      int max = 0;
//	      
//	      if (a == b)
//	    	  return a;
//	      else if (a > b) {
//	    	  max = a;
//	    	  min = b;
//	      }
//	      else {
//	    	  max = b;
//	    	  min = a;
//	      }
//	      
//	      for (int i = min; i <= max; i++) 
//	    	  answer += i;

	      int min = Math.min(a, b);
	      int max = Math.max(a, b);
	     
	      for (int i = min; i <= max; i++) 
	    	  answer += i;
	      
	      return answer;
	  }

}
