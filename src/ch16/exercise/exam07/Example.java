package ch16.exercise.exam07;

public class Example {
	private static int[] scores = { 10, 50, 3 };
	
	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.apply(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int max1 = maxOrMin((x, y) -> Math.max(x, y));
		int max2 = maxOrMin((x, y) -> ((x > y) ? x : y));
		int max3 = maxOrMin((x, y) -> {
			if(x > y) {
				return x;
			} else {
				return y;
			}
		});
		System.out.println("최대값: " + max1);
		
		int min = maxOrMin((x, y) -> Math.min(x, y));
		System.out.println("최소값: " + min);		
	}
}

@FunctionalInterface
interface Operator {
	public int apply(int x, int y);
}