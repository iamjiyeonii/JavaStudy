package LV1;

public class UpperLowerChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "try hello world";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		String answer = "";
		int cnt = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				cnt = 0;
				answer += s.charAt(i);
				continue;
			} else {
				if (cnt == 0 || (cnt%2==0)) {
					answer += Character.toUpperCase(s.charAt(i));
				} else {
					answer += Character.toLowerCase(s.charAt(i));
				}
				cnt++;
			}
		}
		
		return answer;
	}
}
