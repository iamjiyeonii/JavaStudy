package LV2;

import java.util.*;

public class TruckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
		System.out.println(solution(bridge_length, weight, truck_weights));
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		
		// 다리를 건너기 전 대기 트럭 리스트
		Queue<Truck> q_wait = new LinkedList<>();
		
		// 다리를 건너는 트럭 리스트
		Queue<Truck> q_onBridge = new LinkedList<>();
		
		int onBridgeWeight = 0;
		
		for (int w : truck_weights) {
			q_wait.add(new Truck(w, 0));
		}
		
		onBridgeWeight += q_wait.peek().weight;
		q_onBridge.add(q_wait.poll());
		
		int time = 0;
		
		while(!q_onBridge.isEmpty()) {
			time++;
			
			for (Truck t : q_onBridge) {
				// 다리 위 트럭들을 움직임 
				t.index++;
			}
			
			// 트럭이 다리 끝에 다다름
			if (q_onBridge.peek().index > bridge_length) {
				onBridgeWeight -= q_onBridge.poll().weight;
			}
			
			// 대기 중 트럭을 다리에 올림 (무게 고려해야함)
			if (!q_wait.isEmpty() && q_wait.peek().weight + onBridgeWeight <= weight) {
				onBridgeWeight += q_wait.peek().weight;
				q_wait.peek().index++;
				q_onBridge.add(q_wait.poll());
			}
		}
		
		answer = time;
		
		return answer;
	}
	
	static class Truck {
		int weight;
		int index;
		
		public Truck(int weight, int index) {
			this.weight = weight;
			this.index = index;
		}
	}
}
