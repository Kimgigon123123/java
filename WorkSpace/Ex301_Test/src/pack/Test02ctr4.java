package pack;

import java.util.Scanner;

public class Test02ctr4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		while(true) {
			
			System.out.println("0~100수를 입력하세요");
			int inputData = Integer.parseInt(sc.nextLine());
			
			if(inputData>100||inputData<0) {
				System.out.println("다시 입력하세요");
			}
			else {
				System.out.println("입력된 데이터 :"+inputData);
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
