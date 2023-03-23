package test.programmers;

public class S120848 {
	public static void main(String[] args) {
		int n = 3628800;
		int fac = 1;
        int i = 0;

        while(true){
            if(fac <= n){
                fac *= i + 1;
                i++;
            }else break;
        }
        System.out.println(i-1);
    }
}
