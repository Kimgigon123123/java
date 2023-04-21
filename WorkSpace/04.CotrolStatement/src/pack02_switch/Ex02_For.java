package pack02_switch;

public class Ex02_For {
	public static void main(String[] args) {
		//짝수만 출력
		//짝수 ? %2==0
		//제어문은 무한하게 중첩이 가능하다.
		//0~9까지 10번 반복하는 반복문 안보고 만들어보기
		
		
		//1. 1부터 10까지의 누적합을 구하시오.
		//1+2+3+4+5+6...+10
		
		int num=0;
		for (int i = 1; i <= 10; i++) {
			num=num+i;
			System.out.println(i+"까지의 합은 " + num);	
		}
		System.out.println("정답:"+num);
		
		
		
		

		
		
		
		
//			if (i % 2 == 0) {
//				System.out.println("짝수" + i);
//			} else if (i % 2 == 1) {
//				System.out.println("홀수" + i);
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
