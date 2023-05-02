package pack01.thread;

public class Pc1_Youtube extends Thread{
	
	@Override
	public void run() {
		System.out.println("유튜브1번 영상 재생");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("유튜브2번 영상 재생");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("유튜브3번 영상 재생");
	}
}
