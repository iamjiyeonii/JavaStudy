package LV1;

public class StringToInteter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "-1234";
		System.out.println(solution(s));
	}

	public static int solution(String s) {
		int answer = 0;
		
		answer = Integer.parseInt(s);
		
		return answer;
	}
}
