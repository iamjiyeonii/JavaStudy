package LV1;

import java.util.*;

public class mockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,2,4,2};
		//int[] a = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,2,3,4,2,3,2,2,3,4};
		solution(a);
	}

	public static int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {2,1,2,3,2,4,2,5}; 
        int[] s3 = {3,3,1,1,2,2,4,4,5,5};
       
        int[] cnt = {0,0,0};
        
        for (int i = 0; i < answers.length; i++) {
        	if (s1[i%s1.length] == answers[i]) cnt[0]++;
        	if (s2[i%s2.length] == answers[i]) cnt[1]++;
        	if (s3[i%s3.length] == answers[i]) cnt[2]++;
        	
        	System.out.println(i + " = " + cnt[0] + cnt[1] + cnt[2]);
        }
        
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        System.out.println(max);
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < 3; i++) {
        	if (max == cnt[i]) list.add(i+1);
        }
        System.out.println(list.size());
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        	System.out.println(list.get(i));
        }
        
        return answer;
    }
	
	public static int[] solution2(int[] answers) {
        int[] answer = {};
        
        int[][] student = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};
        Map<Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i < student.length; i++) {
        	int cnt = 0;
	    	
	    	for (int j = 0, k = 0; j < answers.length; j++, k++) {
	    		if (j % student[i].length == 0) k=0;
	    		if (student[i][k] == answers[j]) cnt++;	    
	    		System.out.println(j + " = " + student[i][k] + " " + answers[j] + " " + cnt);
	    	}
        	
	    	if (map.get(0) == null) {
	    		map.put(i, cnt);
	    	}
	    	else {
	    		if (map.get(0) > cnt) ;
	    		else if (map.get(0) == cnt) map.put(i, cnt);
	    		else {
	    			map.clear();
	    			map.put(i,cnt);
	    		}
	    	}
	    	System.out.println(cnt + " " + map.size());
        }
        
        answer = new int[map.size()];
        int i = 0;
        for (int key : map.keySet())
        	answer[i++] = key+1;
        
        for (int j = 0; j<answer.length;j++) {
        	System.out.println(answer[j]);
        }
        return answer;
    }
}
