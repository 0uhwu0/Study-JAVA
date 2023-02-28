package test.programmers;

class Solution2 {
    public int[] solution(int n, int[] numlist) {
        int[] answer = new int[n];
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i]%n == 0) {
                for(int j = 0; j < i; j++) {
                    answer[j] = numlist[i];
                }
            }
        }
        return answer;
    }
}
