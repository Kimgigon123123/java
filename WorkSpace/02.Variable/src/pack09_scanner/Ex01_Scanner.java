package pack09_scanner;

import java.util.Scanner;

public class Ex01_Scanner {public static void main(String[] args) {
	//Scanner (입력)=>자바(출력)=>콘솔
	Scanner sc  = new Scanner(System.in);
	// 외부에서들어오는 데이터를 사용해보기위해서 외워서 사용 o
	System.out.println("점수를 입력하세요");
	String inputData = sc.nextLine();//내가 엔터키 치기전까지의 문자열을 가져옴
	//숫자를 두개 받아와서 두 수 의 합을 구하기. 난이도 上
	System.out.println(inputData);
	int score =Integer.parseInt(inputData);
	System.out.println(score+10+"점");
	//1.외부에서 입력한 숫자는 String형태로 inpuData라는 변수에 들어온다.
	//데이터에 +10 한 결과를 출력해보세요.
	
	Scanner sss = new Scanner(System.in);
	System.out.println("숫자아무거나입력");
	String number = sss.nextLine();
	int number2=Integer.parseInt(number);
	System.out.println(number2+20);

	//Scanner sc  = new Scanner(System.in);
	//String inputData = sc.nextLine();
	
	
	Scanner sc2=new Scanner(System.in);
	System.out.println("숫자를 입력하시오");
	String input1 = sc2.nextLine();
	System.out.println("숫자를 입력하시오");
	String input2 = sc2.nextLine();
	int kkk=Integer.parseInt(input1);
	int qqq=Integer.parseInt(input2);
	System.out.println(kkk+qqq);
	
	
	

	
}


}
