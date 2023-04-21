package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Test01_HighLow {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int random=new Random().nextInt(100)+1;
		
//		for(int i=0;i<5;i++) {
//			i=0;//무한루프 만들기 첫번째 방법
//			
//			
//			
//		}
//		for(int i=0; i<1;i--) {
//			//i를 증가x
//		
//		}
//		
//		for(;;) {
//			//true와 같음
//		}
		int count=0;
		for(;;) {
			System.out.println(random);
			count++;
			System.out.println("0~100 숫자 입력하세요");
			int userNum=Integer.parseInt(sc.nextLine());
			if(userNum==random) {
				System.out.println("정답입니다");
				System.out.println(count+"회 시도했습니다");
				break;
			}else if(userNum<random) {
				System.out.println("더 큰 수를 입력해주세요");
			}else {
				System.out.println("더 작은 수를 입력해주세요");
			}
		}
		
		
	}

}
