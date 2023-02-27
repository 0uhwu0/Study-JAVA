package test;

public class test8 {
	   public static void main(String[] args) {
		
	    	int[] sides = {1, 2, 3};
	        int answer = 0;
	        int max = 0;
	        if(sides[0] > sides[1] && sides[0] > sides[2]) {
	        	max = sides[0];
	        	if(Math.max(Math.max(sides[0], sides[1]), sides[2]) == sides[0]) {
	        		answer = 1;
	        	} else {
	        		answer = 2;
	        	}
	        } else if(Math.max(Math.max(sides[0], sides[1]), sides[2]) == sides[1]) {
	        	max = sides[1];
	        	if(max < (sides[0] + sides[2])) {
	        		answer = 1;
	        	} else {
	        		answer = 2;
	        	}
	        } else if(Math.max(Math.max(sides[0], sides[1]), sides[2]) == sides[2]) {
	        	max = sides[2];
	        	if(max < (sides[0] + sides[1])) {
	        		answer = 1;
	        	} else {
	        		answer = 2;
	        	}
	        }
	    }
	   
}

