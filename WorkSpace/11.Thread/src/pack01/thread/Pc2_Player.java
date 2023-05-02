package pack01.thread;

public class Pc2_Player extends Thread {
	int num;
	int speed;
	
	public Pc2_Player(int num, int speed) {
		
		this.num = num;
		this.speed = speed;
	}
	
	@Override
	public void run() {
		int location = 0;
		while(location<50) {
			location = location + speed;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		Pc2_HorseGame.rank=Pc2_HorseGame.rank+1;
		System.out.println(num+"번 말 "+"골인"+Pc2_HorseGame.rank+"등입니다");
		if(num==Pc2_HorseGame.selectNum&&Pc2_HorseGame.rank==1) {
			System.out.println("맞추셧습니다");
		}
		
	}
	
	
}
