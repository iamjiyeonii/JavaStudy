package LV2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Numbers {
    public static void main(String[] args) {
        //int[] numbers = {6,10,2};
        int[] numbers = {3,30,34,5,9,0};
        System.out.println(solution(numbers));
    }

    public static String solution(int[] numbers) {
        String answer = "";
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i : numbers)
            arrayList.add(Integer.toString(i));

        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        for (String s : arrayList)
            answer += s;

        if (answer.startsWith("0")) answer = "0";

        return answer;
    }
}
