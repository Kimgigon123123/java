package pack01_base;

import java.util.Scanner;

public class Ex06_Method {
	//return이 없는 메소드 2개(파라메터가 있음,없음)
	//return이 있는 메소드 2개(파라메터가 있음,없음)
	
	// 이름 타입 형태 전부 자유.
	//리턴 타입 메소드명(파라메터부){
	
	//}
	
	void method1() {
		System.out.println("method1");
	}
	
	void method2(String data) {
		if(data==null) {
			return;//메소드를 중지시키고 블럭킹 끝으로 이동.
		}
		System.out.println("method2"+data);
	}
	
	boolean isMethod3() {
		System.out.println("method3");
		return false;
	}
	
	boolean isMethod4(int data) {
		System.out.println("method4");
		return false;
	}
	
	
	String sMethod() {
		String sResult="String결과";
		return sResult;
	}
	
	double dMethod() {
		double dResult=3.14;
		return dResult;
	}
	
	int[] iMethod() {
		int[] iResult= new int[3];
		return iResult;
	}
	
	Scanner scanMethod(){
		Scanner sResult= new Scanner(System.in);
		return sResult;//해당 메소드를 이용해서 스캐너 기능 사용시 NullPointer Exception 발생
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	void method1(int num1, int num2) {
//		System.out.println(num1+num2);
//	}
//	
//	void method2() {
//		Ex06_Method em= new Ex06_Method();
//		em.method1(2, 4);
//	}
//	
//	int method3(int num3, int num4) {
//		int method3Result= num3*num4;
//		return method3Result;
//	}
//	
//	int method4 () {
//		Ex06_Method em= new Ex06_Method();
//		int method4Result = em.method3(2,4);
//		return method4Result;
//	}
//	
//	
//
//
//	public static void main(String[] args) {
//		Ex06_Method em= new Ex06_Method();
//		em.method1(3, 5);
//		em.method2();
//		System.out.println(em.method3(3, 5));
//		System.out.println(em.method4());
//		
//	}
//	
}
