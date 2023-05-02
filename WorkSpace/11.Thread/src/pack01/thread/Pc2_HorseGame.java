package pack01.thread;

import java.util.Scanner;

public class Pc2_HorseGame  {
	
	public static int selectNum=0;
	public static int rank=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		Pc2_Player p1 = new Pc2_Player(1, 30);
		Pc2_Player p2 = new Pc2_Player(2, 20);
		Pc2_Player p3 = new Pc2_Player(3, 10);
		
		System.out.println("1~3말 골라주세요");
		Pc2_HorseGame.selectNum = Integer.parseInt(sc.nextLine());
		
		p1.start();
		p2.start();
		p3.start();
		
		
	}
	
	
}
