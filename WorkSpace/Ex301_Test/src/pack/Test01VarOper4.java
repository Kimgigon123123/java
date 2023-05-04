package pack;

import java.util.Scanner;

public class Test01VarOper4 {
	public static void main(String[] args) {
		
		
		//4. 스캐너를 통해 두 수를 입력받고 두수를 비교하여 출력하기
		//(if 사용불가)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번쨰 숫자를 입력하세요");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println(num1);
		
		System.out.println("두번쨰 숫자를 입력하세요");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println(num2);
		
		boolean small = num1<num2;
		boolean big = num1>num2;
		boolean equal = num1==num2;
		
		System.out.println((num1%2==1 ? "홀수":"짝수"));
		System.out.println((num2%2==1? "홀수":"짝수"));
		
		
		
		System.out.println(num1+"은"+num2+"보다 작습니다"+small);
		System.out.println(num1+"은"+num2+"보다 큽니다"+big);
		System.out.println(num1+"과"+num2+"은 같습니다"+equal);
		
	}
}
