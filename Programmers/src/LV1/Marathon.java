package LV1;

import java.util.HashMap;
import java.util.Map;

public class Marathon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] p = {"leo","kiki","eden"};
		String[] c = {"eden","kiki"};
		
		System.out.println(solution(p,c));

	}
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < participant.length; i++) {
			if (map.get(participant[i]) != null) map.put(participant[i], map.get(participant[i])+1);
			else map.put(participant[i], 1);
		}
		
		for (int i = 0; i < completion.length; i++) {
			map.put(completion[i], map.get(completion[i])+1);
		}
		
		for (String key : map.keySet()) {
			if (map.get(key)%2 == 1) {
				answer = key;
				break;
			}
		}
		return answer;
	}

}
