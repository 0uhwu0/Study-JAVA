package test.programmers;

// 기울기 : y2 - y1 / x2 - x1 
// 01 23
// 02 13
// 03 12
public class S120875 {
	public static void main(String[] args) {
		int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
		int answer = 0;
		int x0 = dots[0][0];
		int y0 = dots[0][1];
		
		int x1 = dots[1][0];
		int y1 = dots[1][1];
		
		int x2 = dots[2][0];
		int y2 = dots[2][1];
		
		int x3 = dots[3][0];
		int y3 = dots[3][1];
		
		if (((y0-y1) / (x0-x1)) == ((y2-y3) / (x2-x3))) {
			answer = 1;
		} else {
			answer = 0;
		}asdaisdj
		System.out.println(answer);
	}
}
