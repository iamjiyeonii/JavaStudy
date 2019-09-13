package LV1;

import java.util.Arrays;

public class numSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1, 5, 2, 6, 3, 7, 4};
		int[][] c = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		solution(a,c);
	}

	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
        	int[] arr2 = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
        	Arrays.sort(arr2);
        	answer[i] = arr2[commands[i][2]-1];
        	System.out.println(answer[i]);
        }
        return answer;
    }
}
