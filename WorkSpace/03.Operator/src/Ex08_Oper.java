
public class Ex08_Oper {
	public static void main(String[] args) {
		//�� ������: ���ǹ��� ���� ���ȴ�.
		// ���� : � ���� ������ �Ǵ� ���������� �Ǵ��ϴ°�
		// id�� pw�� ���� �Է��� ���� DB�� �ִ� ���� ��ġ�ϴ���?
		// "�α���" : "���̵� �Ǵ� ��й�ȣ�� Ȯ���ϼ���"
		// �� ������ �ݵ�� true�� false�� ���� �������־���Ѵ�.
		int num1= 10, num2=10;
		//==,!=,<=,>=,<,>
		//���ǽ��� ����ϰ������� ����� �ݵ�� true , false�� ���´�
		boolean result1 = num1 == num2;
		System.out.println(result1);
		boolean result2 = num1 != num2;
		System.out.println(result2);
		boolean result3 = num1 >= num2;
		System.out.println(result3);
		boolean result4= num1 > num2;
		System.out.println(result4);
		boolean result5 = num1 <= num2;
		System.out.println(result5);
		boolean result6 = num1 < num2;
		System.out.println(result6);
		
		//���� ���� ��:���� ������(�������� ������ �Ǵ�)
		//�������� ��� TRUE �Ǵ� FALSE�� ����� ���´�.
		//���ǽ�A && ���ǽ�B: ���ǽ�A�� ���̰� ���ǽ� B�� ���� ��� => true �׿ܿ��� false
		//&&(AND,*,������):1*1=1 
		//���ǽ�A || ���ǽ�B: ���ǽ�A�� ���̸� �ڿ� ���ǰ� ������� => true
		//||(or,+,������):1+?=0 , 0+0=0;
		System.out.println("----");
		System.out.println(10 > 5 && 20 > 10); // t
		System.out.println(10 > 5 && 20 < 5 ); // f
		System.out.println(5 > 10 && 20 > 5 ); // f
		System.out.println("----");
		System.out.println(10 > 5 || 20 > 10); // t
		System.out.println(10 > 5 || 20 < 5 ); // t
		System.out.println(5 > 10 || 20 > 5 ); // t
		System.out.println(10>5&&10>5||20>10);
		
	}

}