package ch14.exercise.exam02;

public class MusicRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("음악을 재생합니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}
}
