package pack;

import java.util.Scanner;

public class Test02Ctr {

	
	public static void main(String[] args) {
		
		
		
		//1번 스캐너를 통해 입력 된 값을 비교하여 출력하는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		
		String gender = null;
		int inputData;
		
		
			inputData = Integer.parseInt(sc.nextLine());
			if(inputData==1||inputData==3) {
				gender = "남자";
				
			}
			else if(inputData==2||inputData==4) {
				gender = "여자";
				
			}
			else {
				gender="오류";
			}
		
		
		
		System.out.println("입력된 데이터 : "+inputData);
		System.out.println("비교 후 데이터 : "+gender);
		
		
		
		
	}
	
	
}
