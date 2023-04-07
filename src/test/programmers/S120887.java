package test.programmers;

public class S120887 {
	public static void main(String[] args) {
		int count = 0;
		int i = 10;
		int j = 50;
		int k = 5;
		
		String k1 = String.valueOf(k);
		char[] a;
		
		String i2;
		
		for (i = i; i <= j; i++) {
			i2 = String.valueOf(i);
			a = new char[i2.length()];
			for (int n = 0; n < i2.length(); n++) {
				a[n] = i2.charAt(n);
				if(k1.equals(String.valueOf(a[n]))) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
