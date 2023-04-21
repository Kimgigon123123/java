package pack03_array2;

import java.util.Random;
import java.util.Scanner;

public class Test01_Game_Practice {
	public static void main(String[] args) {
		
		System.out.println("게임을시작합니다");
		System.out.println("난이도를 입력해주세요");
		Scanner sc=new Scanner(System.in);
		int dif=Integer.parseInt(sc.nextLine());
		System.out.println("난이도:"+dif);
		
		int random = new Random().nextInt(dif);
//		System.out.println(random); 주석  풀면 정답 보여줌
		
		int count=1;
		while(true) {
		int box=0;
		while(box<dif) {
			System.out.print("ㅁ");
			box++;
		}
		System.out.println();
		System.out.println("선택할 숫자를 입력하세요");
		int num=Integer.parseInt(sc.nextLine())-1;
		
		if(num==random) {
			System.out.println("정답:"+(num+1));
			int a=0;
			while(a<random) {
				System.out.print("x");
				a++;
			}
			System.out.print("ㅇ");
			int b=random+1;
			while(b<dif) {
				System.out.print("x");
				b++;
				
				
		}System.out.println("");
		System.out.println("시도 횟수는 "+count);
		if(count==1) {
			System.out.println("원트 ㅊㅋ");
		}
		break;
			
		
		}
		else {
			System.out.println("오답");
			count++;
			
		
	}

	}
}
}