package test.programmers;

public class S120899 {
	public static void main(String[] args) {
		int[] array = {1, 8, 3};
		int[] answer = new int[2];
        int a = Integer.MIN_VALUE * 1;
        for(int i = 0; i < array.length; i++) {
            if(a < array[i]) {
                answer[0] = array[i];    
                answer[1] = i;
            }
        }
	}
}
