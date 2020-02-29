package LV2;

import java.util.HashMap;
import java.util.Map;

public class phoneBook {

    public static void main(String[] args) {
        String[] phoneBook = {"119", "97674223", "1195524421"};
        System.out.println(solution1(phoneBook));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        for(int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book.length; j++) {
                if (i == j) continue;
                if (phone_book[j].startsWith(phone_book[i])) return false;
            }
        }

        return answer;
    }

    public static boolean solution2(String[] phone_book) {
        boolean answer = true;

        for(int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book.length; j++) {
                if (i == j)
                    continue;
                else {
                    if (phone_book[i].length() > phone_book[j].length()) continue;
                    if (phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length())))
                        return false;
                }
            }
        }

        return answer;
    }

    public static boolean solution1(String[] phone_book) {
        boolean answer = true;
        Map<Integer, String> map = new HashMap<Integer, String>();

        for(int i = 0; i < phone_book.length; i++)
            map.put(i, phone_book[i]);

        for(int i = 0; i < map.size(); i++) {
            for (int j = 0; j < map.size(); j++) {
                if (i == j) continue;
                else {
                    if (map.get(i).length() > map.get(j).length()) continue;
                    if (map.get(i).equals(map.get(j).substring(0, map.get(i).length())))  return false;
                }
            }
        }
        return answer;
    }
}
