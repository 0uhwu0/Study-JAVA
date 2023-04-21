package test.programmers;

// 기울기 : y2 - y1 / x2 - x1 
// 01 23
// 02 13
// 03 12
public class S120875 {
	public static void main(String[] args) {
		int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
		int answer = 0;
		int x0 = dots[0][0];
		int y0 = dots[0][1];
		
		int x1 = dots[1][0];
		int y1 = dots[1][1];
		
		int x2 = dots[2][0];
		int y2 = dots[2][1];
		
		int x3 = dots[3][0];
		int y3 = dots[3][1];
		
		double a1 = ((y0-y1) / (x0-x1)) + ((y0-y1) % (x0-x1));
		double a2 = ((y2-y3) / (x2-x3)) + ((y2-y3) % (x2-x3));
		
		if (a1 == a2) {
			answer = 1;
		}
		
		double b1 = ((y0-y2) / (x0-x2)) + ((y0-y2) % (x0-x2));
		double b2 = ((y1-y3) / (x1-x3)) + ((y1-y3) % (x1-x3));
		
		if (b1 == b2) {
			answer = 1;
		}
		
		double c1 = ((y0-y3) / (x0-x3)) + ((y0-y3) % (x0-x3));
		double c2 = ((y1-y2) / (x1-x2)) + ((y1-y2) % (x1-x2));
		
		if (c1 == c2) {
			answer = 1;
		}
		
		System.out.println(answer);
	}
}
