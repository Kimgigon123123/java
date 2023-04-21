package pack06_game;

import java.util.Scanner;

public class Test02_ScorePg {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int kor=-1, eng=-1, mat=-1; // -1이면 입력 x 상태
		System.out.println("국어 점수를 입력해주세요.");
		while(kor==-1) {//초기에 -1로 값을 초기화 해놨기 때문에 초기화만 된 상태에서는 계속해서 반복
			kor=Integer.parseInt(sc.nextLine());//0~100
			if(kor>0 && kor<=100) {
				System.out.println("국어성적입력완료");
				
			}else {
				System.out.println("잘못 입력 1~100까지만 가능!!");
				kor = -1;
			}
	}
		System.out.println("영어 점수를 입력해주세요.");
		while(eng==-1) {//초기에 -1로 값을 초기화 해놨기 때문에 초기화만 된 상태에서는 계속해서 반복
			eng=Integer.parseInt(sc.nextLine());//0~100
			if(eng>0 && eng<=100) {
				System.out.println("영어성적입력완료");
				
			}else {
				System.out.println("잘못 입력 1~100까지만 가능!!");
				eng = -1;
			}
		
		}
		System.out.println("수학점수를 입력해주세요");
		while(mat==-1) {//초기에 -1로 값을 초기화 해놨기 때문에 초기화만 된 상태에서는 계속해서 반복
			mat=Integer.parseInt(sc.nextLine());//0~100
			if(mat>0 && mat<=100) {
				System.out.println("수학성적입력완료");
			}else {
				System.out.println("잘못 입력 1~100까지만 가능!!");
				mat = -1;
			}
		
		}
		while(mat==-1) {//초기에 -1로 값을 초기화 해놨기 때문에 초기화만 된 상태에서는 계속해서 반복
			mat=Integer.parseInt(sc.nextLine());//0~100
			if(mat>0 && mat<=100) {
				System.out.println("수학성적입력완료");
			}else {
				System.out.println("잘못 입력 1~100까지만 가능!!");
				mat = -1;
			}
			
		
		}
		System.out.println("총합"+(kor+eng+mat));
		System.out.println("평균"+((kor+eng+mat)/3));
	}
}