package pack;

import java.util.Scanner;

public class Test02ctr3 {
	
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("숫자 두개 입력하세요");
			int inputData1 = Integer.parseInt(sc.nextLine());
			int inputData2 = Integer.parseInt(sc.nextLine());
			
			System.out.println("입력된 데이터 : "+inputData1+","+inputData2);
			
			
			if(inputData1>inputData2) {
				System.out.println(inputData1+">"+inputData2);
			}
			else if(inputData1<inputData2){
				System.out.println(inputData1+"<"+inputData2);
			}
			
			else {
				System.out.println(inputData1+"="+inputData2);
			}
			
			
			
			
			
			
		}
	
	
}
