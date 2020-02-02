package LV2;

public class StockPrice {

    public static void main(String[] args) {

        int[] prices = {6,9,5,7,4};

        solution(prices);
    }

    public static int[] solution(int[] prices) {
        int[] answer = {};
        int sec = 0;

        answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            sec = 0;
            for (int j = i+1; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    sec++;
                    break;
                }
                else
                    sec++;
            }
            answer[i] = sec;
        }

        for (int a : answer)
            System.out.println("answers : " + a);

        return answer;
    }
}
