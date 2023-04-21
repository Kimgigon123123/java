package pack09_scanner;

import java.util.Scanner;

public class Ex02_Scanner {public static void main(String[] args) {
	//두수 더하기
	Scanner sc=new Scanner(System.in);
	System.out.println("숫자를 입력하시오");
	String input1 = sc.nextLine();
	System.out.println("숫자를 입력하시오");
	String input2 = sc	.nextLine();
	int sum1=Integer.parseInt(input1);
	int sum2=Integer.parseInt(input2);
	System.out.println(sum1+sum2);
	
	//평균점수
	Scanner avg_sc=new Scanner(System.in);
	System.out.println("국어 점수를 입력하세요");
	String kor_score=avg_sc.nextLine();
	System.out.println("수학 점수를 입력하세요");
	String math_score=avg_sc.nextLine();
	int kor = Integer.parseInt(kor_score);
	int math = Integer.parseInt(math_score);
	System.out.println("평균은 "+(kor+math)/2+"점");
	
	//나이구하기
	Scanner age_sc=new Scanner(System.in);
	System.out.println("당신이 태어난 년도는? ex)xxxx");
	String year=age_sc.nextLine();
	int age=2023-Integer.parseInt(year);
	System.out.println("만"+age+"세");
	
	//소수점없애기
	Scanner product_sc=new Scanner(System.in);
	System.out.println("소수점을 입력하세요");
	String number22=product_sc.nextLine();
	double prod=Double.parseDouble(number22);
	int iNum=(int)prod;
	System.out.println(iNum);
	
	
	
	
	
	
	
	

}

}
