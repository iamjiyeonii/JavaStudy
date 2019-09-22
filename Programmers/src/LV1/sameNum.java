package LV1;

import java.util.*;

public class sameNum {
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};

		solution(arr);
	}
	
	public static int[] solution(int []arr) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
        	if (list.get(list.size() - 1) == arr[i]) continue;
        	else list.add(arr[i]);
        }

        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i).intValue();
        }
        
        return answer;
	}
	
}
