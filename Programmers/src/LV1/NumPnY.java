package LV1;

public class NumPnY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "pPoooyY";
		System.out.println(solution(s));
	}
	
	static boolean solution(String s) {
        boolean answer = true;

        int numP = 0;
        int numY = 0;

        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
        	if (s.charAt(i) == 'p') numP += 1;
        	else if (s.charAt(i) == 'y') numY += 1;
        }
        
//        for (int i = 0; i < s.length(); i++) {
//        	if ((s.charAt(i) == 'p') || (s.charAt(i) == 'P')) numP += 1;
//        	else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') numY += 1;
//        }
        
        if (numP == numY) answer = true;
        else answer = false;
        
        return answer;
    }

}
