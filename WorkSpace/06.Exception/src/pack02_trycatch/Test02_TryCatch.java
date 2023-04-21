package pack02_trycatch;

import java.util.Random;
import java.util.Scanner;

public class Test02_TryCatch {

	public static void main(String[] args) {
		System.out.println("게임 시작, 난이도를 입력하세요");
		Scanner sc=new Scanner(System.in);
		String[]arr=new String[0];
		int dif=-1;
		
		while(dif<0) {
			try {
				dif=Integer.parseInt(sc.nextLine());
				arr = new String[dif];
			}
			catch (Exception e) {
				System.out.println("숫자를 입력하세요");
			}
			
			}
			
		
	
		for(int i=0;i<dif;i++) {
		arr[i]="?";
		System.out.print("["+arr[i]+"]");
		}
		
		System.out.println();
		int random = new Random().nextInt(dif);
		System.out.println(random);
		System.out.println("숫자를 입력하세요");
		while(true) {
		try {
		int uNum=Integer.parseInt(sc.nextLine())-1;
		
		
			if(uNum==random) {
				System.out.println("정답입니다");
				arr[random]="O";
				for(int i=0;i<dif;i++) {
					System.out.print("["+arr[i]+"]");
				}
				break;
			}
			else {
				System.out.println("오답입니다");
				arr[uNum]="X";
				for(int i=0;i<dif;i++) {
					
					System.out.print("["+arr[i]+"]");
					
				}
				
			}
				}
				catch (Exception e) {
					System.out.println("숫자입력하세요");
				
				}
			}
		}

}

