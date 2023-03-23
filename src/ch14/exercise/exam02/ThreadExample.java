package ch14.exercise.exam02;

public class ThreadExample {
	public static void main(String[] args) {
		Thread t1 = new MovieThread();
		t1.start();
		
		Thread t2 = new Thread(new MusicRunnable());
		t2.start();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("메인 쓰레드!!");
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
