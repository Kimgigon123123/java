package pack01.thread;

public class Pc1_Melon extends Thread {
	
	@Override
	public void run() {
		System.out.println("멜론1번 음악 재생");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("멜론2번 음악 재생");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("멜론3번 음악 재생");
	}
}
