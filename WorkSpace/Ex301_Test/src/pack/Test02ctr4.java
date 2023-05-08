package pack;

import java.util.Scanner;

public class Test02ctr4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int inputData;
		
		while(true) {
			
			System.out.println("0~100수를 입력하세요");
			inputData = Integer.parseInt(sc.nextLine());
			
			if(inputData>100||inputData<0) {
				System.out.println("다시 입력하세요");
			}
			else {
				System.out.println("입력된 데이터 :"+inputData);
				break;
			}
				
		}
		
		System.out.print("출력데이터 : ");
		for(int i =inputData; i>0;i--) {
			System.out.print(i+",");
		}
		
		System.out.println();
		for(int a =0; a<inputData; a++) {
			for(int b=0; b<=a; b++) {
				System.out.print("★");
				
			}
			System.out.println();
		}
		
		System.out.println("숫자 두개를 입력하세요");
		int dataA = Integer.parseInt(sc.nextLine());
		int dataB = Integer.parseInt(sc.nextLine());
		System.out.println("입력된 데이터 : "+dataA+","+dataB);
		
		
		if(dataA>dataB) {
			
			int sum=0;
			while(dataB<dataA) {
				System.out.print(dataB+"+");
				sum=sum+dataB;
				dataB++;
				
			}
			sum=sum+dataB;
			System.out.print(dataB+"="+sum);
			
		}
		else if(dataA<dataB) {
			
			int sum=0;
			while(dataA<dataB) {
				System.out.print(dataA+"+");
				sum=sum+dataA;
				dataA++;
			}
			sum=sum+dataA;
			System.out.println(dataA+"="+sum);
			
		}
		
		
		
		
		
		
	}
}
