package pack01_string;

import java.util.Scanner;

public class Ex01String {public static void main(String[] args) {
	//string:기본형 변수x,참조형 변수
		//참조형 변수는 스택이라는 메모리 공간에 힙영역의 주소만 저장하고 실제값은
		//힙 영역에 있는 형태.(기본형 변수는 힙 영역 사용x)
		String strVar1="Kgg";//메모리주소1
		String strVar2="Kgg";//메모리주소1
		System.out.println(strVar1);
		System.out.println(strVar2);
		if(strVar1==strVar2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		//new<- 힙 영역에 공간을 만들다(인스턴스과정)
		String strVar3=new String("Kgg");
		String strVar4=new String("Kgg");
		
		Scanner sc= new Scanner(System.in);
		String strVar5=sc.nextLine();//이니셜을 대문자로 입력하기
		if(strVar1==strVar5) {
			System.out.println("1,5 같다");
		}else if(strVar3==strVar5) {
			System.out.println("3,5 같다");
		}
		else {
			System.out.println("135는 다르다");
		}
		
		if(strVar3==strVar4) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
	
}
	


}
