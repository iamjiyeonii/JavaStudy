package LV2;

import java.util.Stack;

public class TopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] heights = {6,9,5,7,4};
		
		solution(heights);
	}

	public static int[] solution(int[] heights) {
		int[] answer = {};
		
		boolean isOk = false;
		Stack<Integer> sendTop = new Stack<>();
		Stack<Integer> recvTop = new Stack<>();
		
		for (int h : heights)
			sendTop.push(h);

		int sender_idx = heights.length;
		
		while (!sendTop.isEmpty()) {
			int sender = sendTop.pop();
			sender_idx--;
			
			for (int receiver_idx = sender_idx - 1; receiver_idx >= 0; receiver_idx--) {		
				System.out.println("===" + sender + " " + heights[receiver_idx]);
				if (sender < heights[receiver_idx]) {
					recvTop.push(receiver_idx+1);
					isOk = true;
					break;
				}
			}
			
			if (isOk == false) {
				recvTop.push(0);
			}
			
			isOk = false;
		}
		
		answer = new int[heights.length];
		int i = 0;
		while (!recvTop.isEmpty()) {
			answer[i] = recvTop.pop();
			System.out.println(answer[i]);
			i++;
		}
		
		return answer;
	}
}
