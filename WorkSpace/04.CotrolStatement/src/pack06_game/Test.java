package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int random = new Random().nextInt(100)+1;// 1~100까지의 수 채번
		Scanner sc = new Scanner(System.in);
		System.out.println(random);
		int num=0;
		
		while(true) {
			System.out.println("1~100 숫자 입력");
			String inputData = sc.nextLine();
			int i=Integer.parseInt(inputData);
			if(random>i) {
				num++;
				System.out.println("더 큰 수를 입력하세요");
			}
			else if(random<i) {
				num++;
				System.out.println("더 작은 수를 입력하세요");
			}
			else{
				System.out.println("정답");
				System.out.println((num+1)+"번 시도 하셨습니다");
				break;
			}
		}
		
		Scanner sc2=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("국어점수를 입력하세요");
			int kor=Integer.parseInt(sc2.nextLine());
			if(kor>100 || kor<0) {// 100 > 100 false || 100<0 false 
				System.out.println("다시입력");
			}else {
				System.out.println("영어점수를 입력하세요");
				int eng=Integer.parseInt(sc2.nextLine());
				if(eng >100||eng <0) {
					System.out.println("다시입력");
				}else {
					System.out.println("수학점수를 입력하세요");
					int mat=Integer.parseInt(sc2.nextLine());
					if(mat >100 || eng<0) {
						System.out.println("다시입력");
						
					}else {
						System.out.println("총합="+(kor+eng+mat));
						System.out.println("평균="+(kor+eng+mat)/3);
						break;
					}
				}
			}
		}
	
		
		
			
		}
	

		
}
		


