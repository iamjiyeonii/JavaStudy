package LV2;

import javax.management.MBeanAttributeInfo;
import javax.print.DocFlavor;
import java.util.*;

public class Printer {
    public static void main(String[] args) {
        //int[] priorities = {2,1,3,2};
        int[] priorities = {1,1,9,1,1,1};
        System.out.println(solution(priorities, 0));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        int j = 0;
        List<PrintInfo> list = new LinkedList<>();
        List<PrintInfo> priorityList = new LinkedList<>();

        for(int i = 0; i < priorities.length; i++) {
            list.add(new PrintInfo(i, priorities[i]));
        }

        while(!list.isEmpty()) {

            for(j = 1; j < list.size(); j++) {
                if (list.get(0).priority < list.get(j).priority) {
                    list.add(list.size(), list.get(0));
                    list.remove(0);
                    break;
                }
            }

            if(j == list.size()) {
                priorityList.add(list.remove(0));
                System.out.println("priority : " + priorityList.get(priorityList.size()-1).priority + ", location : " + priorityList.get(priorityList.size()-1).location);
            }
        }

        for (int i = 0; i < priorityList.size(); i++) {
            if(priorityList.get(i).location == location) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }

    static class PrintInfo {
        int location;
        int priority;

        public PrintInfo(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }

    public static int solution2(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for (int i : priorities) {
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length - 1;

        while (!que.isEmpty()) {
            Integer i = que.poll();
            if (i == priorities[size - answer]) {
                answer++;
                l--;
                if (l < 0) break;
            } else {
                que.add(i);
                l--;
                if (l < 0) l = que.size() - 1;
            }
        }

        return answer;
    }
}
