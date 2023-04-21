package pack03_array2;

import java.util.Random;
import java.util.Scanner;

public class Test01_Game {
	
		
	
		public static void main(String[] args) {
			
		

	System.out.println("난이도 입력하세요");
	Scanner sc=new Scanner(System.in);
	int dif = Integer.parseInt(sc.nextLine());
	int random = new Random().nextInt(dif)+1;
	System.out.println(dif+"단계 입니다");
	
	int a=1;
	while(a<=dif) {
	a++;
	System.out.print("ㅁ");
	}
	System.out.println();
	
	System.out.println("숫자를 입력하세요");
	int num = Integer.parseInt(sc.nextLine());
	
	if(num==random) {
		System.out.println("정답");
	}
	else {
		System.out.println("오답");
	}
	
	
	int b = 1;
	while(b<random) {
		System.out.print("x");
		b++;
	}
	System.out.print("O");
	while(dif>random) {
		System.out.print("x");
		random++;
	}
	
	
	
	
	
	
	
	
	

	
	
}
	
	
	
	
	
	
	
	

	
	
}
		

