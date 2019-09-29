package LV1;

import java.util.*;

public class ArrNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,9,7,10};
		int d = 5;
		
		System.out.println(solution(arr,d));
	}

	public static int[] solution(int[] arr, int divisor) {
	      int[] answer = {};
	      
	      List<Integer> list = new ArrayList<Integer>();
	      
	      for (int i = 0; i < arr.length; i++) {
	          if (arr[i] % divisor == 0)
	              list.add(arr[i]);
	      }
	      
	      if (list.size() == 0) {
	          answer = new int[1];
	          answer[0] = -1;
	      }
	      else {
	          Collections.sort(list);
	          
	          answer = new int[list.size()];
	          for (int i = 0; i < list.size(); i++)
	        	  answer[i] = list.get(i);
	      }
	      return answer;
	  }
	
}
