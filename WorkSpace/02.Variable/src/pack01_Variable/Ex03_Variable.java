package pack01_Variable;

public class Ex03_Variable {
	public static void main(String[] args) {

		int value=0 ;
		int result = value + 10; //�����߻�, �ʱ�ȭ ���������� ���� ���Ұ�
		
//		int value = 10;
//		int result = value + 10;
		System.out.println(result);
		//������ �������� ��Ģ������ �����ϴ�.
		//���Ҵ�. (������ ��� ����°� �ƴ϶� ���� �ٽ� �༭ �ٲ�)
		result=1+1+10;
		//result�� ������ ��Ģ������ ����� �����ϰ� ���� ����غ���
		result=10-3;
		result=2*4;
		result=10/2;
		System.out.println(result);
		result=value;
		System.out.println(result);
	}

}
