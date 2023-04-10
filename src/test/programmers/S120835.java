package test.programmers;

import java.util.*;

public class S120835 {
	public static void main(String[] args) {
		int[] emergency = {30, 10, 23, 6, 100}; // 2, 4, 3, 5, 1
		int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++){
//            if(answer[i] != 0){
//                continue;
//            }
            int idx = 1;
            for(int j = 0; j < answer.length; j++){
                if(emergency[i] < emergency[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }
		System.out.println(Arrays.toString(answer));
	}
}
