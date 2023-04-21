package pack03_array2;

import java.util.Random;
import java.util.Scanner;

public class Test02_Game {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("랜덤한 숫자 맞추기 게임!");
		System.out.println("난이도를 선택해주세요.");
		int level = Integer.parseInt(sc.nextLine());
		int[] gameArray = new int[level]; // 3 --> [0][0][0]
		String[] gameResults=new String[level];//[null] [null] [null] ... [null]
		for(int i=0; i<gameResults.length;i++) {
			gameResults[i]="?";
		}
		int  random = new Random().nextInt(level);//0~2
		System.out.println(random);
		
		gameArray[random]=1;//[1] [0] [0] 랜덤한 곳에 하나 생김
		
		while(true) {
			System.out.println("값입력");
			for(int i=0; i<gameResults.length;i++) {
				System.out.print("["+gameResults[i]+"]");
				
			}System.out.println();
		
		
		
			System.out.println("1부터 "+gameArray.length+"까지의 값을 입력!");
			int userNum=Integer.parseInt(sc.nextLine())-1; 
			if(gameArray[userNum]==1) {
				gameResults[random]="O";
				for(int i=0; i<gameResults.length;i++) {
					System.out.print("["+gameResults[i]+"]");
				}
				System.out.println("");
				System.out.println("정답");
				break;
			}
			else {
				gameResults[userNum]="X";
				System.out.println("땡");
			}
		}
		
	}

}
