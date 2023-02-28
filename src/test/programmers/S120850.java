package test.programmers;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String a = my_string.replaceAll("[a-zA-Z]", "");
        int[] answer = new int[a.length()];
        String[] b = a.split("");
        for(int i = 0; i < a.length(); i++) {
            answer[i] = Integer.parseInt(b[i]); 
        }
        Arrays.sort(answer);
        return answer;
    }
}
