package pack02_array;

import java.util.Scanner;

public class Ex03_Array {public static void main(String[] args) {//arguments(인수,파라미터):main 메소드 실행전 필요할것
//	String[] error= {};
//	System.out.println(error[0]);
	//예)버전 정보
//	System.out.println(args[0]);
	//args[0]을 출력하면 오류가 발생한다.
	//1. 내가 만든 배열로 똑같은 오류를 만들어보기.
	System.out.println(args[0]);

	//데이터타입[]배열이름=new데이터타입[크기]
	
	// 내가 알고있는 모든것들 <-
	//String 타입을 가지는 배열 크기는 10으로 만들어보기.
	//String[0] <- 어떤값이 들어있을까?
	//int[0]에 무슨값이 초기에 있었는지? 초기값: 0 <- 숫자형태의 변수타입은 전부 0
	//String[0] <- 어떤 값이 들어있을까? null (참조형 변수들의 초기값)
	//String[]animals=new String[3];
	//System.out.println(animals[0]);
	String[] animals= {"강아지","고양이","비둘기"};
	System.out.println(animals[0]);
	System.out.println(animals[0]+animals[1]+animals[2]);
	
	int[] intArray= {0,1,2,3,4,5,6,7,8,9};
	System.out.println(intArray[0]);
	//{} <- 배열을  초기화하는 방법중에 값의 갯수에 따라서 배열의 크기를 가변적으로 사용가능한
	//방법이 있다.이 방법은 많이 사용이 안됨. 이유가 뭘까?
	
}
}
