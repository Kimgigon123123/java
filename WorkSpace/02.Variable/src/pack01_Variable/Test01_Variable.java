package pack01_Variable;

public class Test01_Variable {
	public static void main(String[] args) {
		//int num1, int num2
		// 각각의 변수에는 숫자 1과 2가 담아져있음.
		//값의 재할당 x , 두개의 숫자를 바꿔보기.
		//num1(1) , num2(2)
		//num1=2 <= X
		// num1(2), num2(1)
		
		int num1;
		int num2;
		int num3;
		num1=1;
		num2=2;
        num3=num1;
        
		num1=num2;
		System.out.println(num1);
		num2=num3;
		System.out.println(num2);
	}

}
