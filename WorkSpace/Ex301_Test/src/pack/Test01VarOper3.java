package pack;

import java.util.Scanner;

public class Test01VarOper3 {
	public static void main(String[] args) {
		
		
		
		//3. 스캐너를 통해 입력받은 문자 원하는 형태로 바꾸기
		
		Scanner sc =new Scanner(System.in);
		int inputData;
		while(true) {
			
			System.out.println("1~100사이의 값을 입력하시오");
			inputData = Integer.parseInt(sc.nextLine());
			if(inputData>100||inputData<0) {
				
			}
			else {
				break;
			}
			
			
		}
		System.out.println("사용자가 입력한 값 : "+inputData);
		int iData = inputData;
		System.out.println("iData에 담긴 값 :"+iData);
		
		System.out.println("실수를 입력하시오");
		double inputData2 = Double.parseDouble(sc.nextLine());
		System.out.println("사용자가 입력한 값 : "+inputData2);
		double dData = inputData2;
		System.out.println("dData에 담긴 값 :"+dData);
		
		
		
	}
}
