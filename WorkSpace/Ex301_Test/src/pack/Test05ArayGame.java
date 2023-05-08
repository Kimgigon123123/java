package pack;

import java.util.Random;
import java.util.Scanner;

public class Test05ArayGame {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Random ran = new Random() ;
		 
		 
		System.out.println("난이도를 입력해주세요 1~아무숫자 가능");
		int dif = Integer.parseInt(sc.nextLine());
		System.out.println("난이도 "+dif );
		
		int[] Arr = new int[dif];
		
		Arr[ran.nextInt(dif)]=1;
		
		
		int count=1;
		
		while(true) {
			
			System.out.println("답을 맞춰주세요");
			int inputData = Integer.parseInt(sc.nextLine());
			
			if(Arr[inputData-1]==1) {
				System.out.println("정답 : "+ count +"번 시도 하셨습니다");
				break;
			}
			else if(Arr[inputData-1]==0) {
				count++;
			}
		}
		
		
		
		
		
		
		
		
	}
	
	
}
