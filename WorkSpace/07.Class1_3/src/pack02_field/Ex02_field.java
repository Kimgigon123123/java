package pack02_field;

import java.util.Random;
import java.util.Scanner;

public class Ex02_field {
	//클래스의 블럭킹 사이(전부 필드)==> 멤버
	//1. 내가 알고있는 모든 타입을 사용해서 해당하는 타입의 필드를 만들어보기.
	int intField;
	String strField;
	double dbField;
	float floField;
	char chaField;
	boolean boolField;
	
	Scanner sc;
	Random random;
	int[] arr;
	
	
	//2. Ex02_FieldMain에서 Ex02_Field의 필드(멤버)를 모두 출력해보기
	public static void main(String[] args) {
		Ex02_field es1=new Ex02_field();
		System.out.println(es1.strField);
		System.out.println(es1.intField);
		System.out.println(es1.dbField);
		System.out.println(es1.floField);
		System.out.println(es1.chaField);
		
		System.out.println(es1.sc);
		System.out.println(es1.random);
		System.out.println(es1.arr);

	}
	
	
}
