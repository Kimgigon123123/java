package pack;

import java.util.Scanner;

public class Test04Java1 {

	public static void main(String[] args) {
		
		
		
		int result=rtnInt();
		System.out.println("입력하신 숫자는 "+result+"입니다");
		
		String result2 = rtnString();
		System.out.println("입력하신 문자는"+result2);
		
		
	}
	
	private static int rtnInt() {
		Scanner sc = new Scanner(System.in);
		int inputData=0;
		System.out.println("숫자를 입력해주세요");
		System.out.print("입력 : ");
		while(true) {
			try {
				inputData = Integer.parseInt(sc.nextLine());
				break;
				}catch (Exception e) {
					System.out.println("다시 입력해주세요");
				}
		}
		
		
		return inputData;
	}
	
	
	private static String rtnString() {
		Scanner sc = new Scanner (System.in);
		String inputData=null;
		
		System.out.println("숫자가 아닌 문자열을 입력해주세요");
		System.out.print("입력 : ");
		
		while(true) {
			inputData=sc.next();
			try {
				Integer.parseInt(inputData);
				System.out.println("다시입력");
			}catch (Exception e) {
				return inputData;
			}
		}
		
		
		
		
		
		
	}
	
	
	
}
