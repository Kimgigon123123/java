package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		int random = new Random().nextInt(100)+1;
		Scanner sc = new Scanner(System.in);
		int num=1;
		while(true) {
			System.out.println(random);
			System.out.println("0~100까지의 정수를 입력하세요");
			int i=Integer.parseInt(sc.nextLine());
			if(random>i) {
				System.out.println("더 큰 수를 입력하세요");
				num++;
			}else if (random < i) {
				System.out.println("더 작은 수를 입력하세요");
				num++;
			}else {
				System.out.println("정답");
				break;
			}
		}System.out.println(num+"번 시도 했습니다");
		
		    Scanner sc2=new Scanner(System.in);
		while(true) {
			System.out.println("국어 점수를 입력하세요");
			int kor = Integer.parseInt(sc2.nextLine());
			if(kor>100 || kor<0) {
				System.out.println("다시 입력하세요");
			}else {
				System.out.println("영어 점수를 입력하세요");
				int eng = Integer.parseInt(sc2.nextLine());
				if(eng >100 || eng<0) {
					System.out.println("다시 입력하세요");
				}else {
					System.out.println("수학 점수를 입력하세요");
					int mat = Integer.parseInt(sc.nextLine());
					if(mat>100||mat<0) {
						System.out.println("다시 입력하세요");
					}else {
						System.out.println("총점은 "+(kor+eng+mat));
						System.out.println("평균은 "+((kor+eng+mat)/3));
						break;
					}
				}
			}
			
		}
		
		
	}

}
