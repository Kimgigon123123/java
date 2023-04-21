import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//다항연산자 또는 이항연산자를 이용해서 문제풀어보기.
		//Scanner이용해보기
		
		
		
		//콘솔창을 통해서 입력받아온 String데이터를 int로 바꾼후 해당
		//숫자가 짝수인지 또는 홀수 인지 판단하여
		//콘솔창에 출력하세요
		
		//콘솔창을 통해서 String 데이터 (숫자) 두개 입력 받는다.
		//각각의 숫자는 num1과 num2로 구분한다.
		//두숫자의 더하기 빼기 곱하기 나누기 한 결과를 출력하기
		
		// 두 숫자중 더 큰 숫자가 어떤 숫자인지 표시하기.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		System.out.println(Integer.parseInt(sc.nextLine())%2==1? "홀수":"짝수");
		
		int num1=Integer.parseInt(sc.nextLine());
		int num2=Integer.parseInt(sc.nextLine());
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		String result=num1==num2? "같음": num1 <num2 ? "num2가 큼":"num1가 큼";
		System.out.println(result );
		//method(메소드)==미리 만들어놓은 기능을 호출해서 사용한다==?
		
		
	}

}
