package pack01_Variable;

public class Test01_Variable {
	public static void main(String[] args) {
		//int num1, int num2
		// ������ �������� ���� 1�� 2�� ���������.
		//���� ���Ҵ� x , �ΰ��� ���ڸ� �ٲ㺸��.
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
