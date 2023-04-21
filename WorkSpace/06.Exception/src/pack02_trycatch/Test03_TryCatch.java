package pack02_trycatch;

import java.util.Random;
import java.util.Scanner;

public class Test03_TryCatch {
	public static void main(String[] args) {
		System.out.println("게임 시작, 난이도를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int[]arr=new int[0];
		int dif=-1;
		while(dif<0) {
			try {
			dif = Integer.parseInt(sc.nextLine());
			arr= new int[dif];
			}
			catch (Exception e) {
				System.out.println("0이상의 값을 입력해주세요");
			}

		}
		System.out.println("난이도는 "+dif);
		int random = new Random().nextInt(dif);
		System.out.println("숫자를 맞추세요.");
		System.out.println(random);
		
		while(true) {
			try {
				int uNum=Integer.parseInt(sc.nextLine())-1;
				if(uNum==random) {
					System.out.println("정답");
					break;
				}
				else {
					System.out.println("오답");
				}
			}
			catch (Exception e) {
				System.out.println(dif + "이하의 숫자를 입력하세요");
			}
		}
		

		
		
		
		
		
		
	}

}
