package test.programmers;

class Solution3 {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int j = 0;
        
        for(int i = 0; i < numlist.length; i++) {
            answer = new int[j];
            if(numlist[i]%n == 0) {
                answer[j] = numlist[i];
                j++;
            }
        }
        return answer;
    }
}
