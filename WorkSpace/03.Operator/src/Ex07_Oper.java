public class Ex07_Oper {public static void main(String[] args) {
	// = (����, �� �Ҵ�)
	// �� ������ (== , < , > , <= , >=)
	// �ʰ�, �̸� : 1 < 4 <<== �ش� ���� �̿��ؼ� 0 �̻��� ���ڸ�����
	// ����� ���ϱ�? 2~3
	// �̻�, ���� : 1 <=4 <<== �ش� ���� �̿��ؼ� 0�̻��� ���ڸ� ����
	// ����� ���ϱ�? 1~4
	
	int num=10;
	String result = num == 10? "�´�" : "Ʋ����" ;
	System.out.println(result);
	
	// ���ڰ� 10�̸� 1�� �׸��� �ƴ϶�� 2�� ��� ���׿����� �Ẹ��
	int resultInt = num == 10? 1 : 2;
	System.out.println(resultInt + result);
	// num�� �ִ� ���� 9���϶�� true �׿ܿ��� false�� �������ִ� ���� �ϼ��غ���
	
	int inum=9;
	boolean resultB = inum <=9? true : false;
	System.out.println(!resultB);
	
	
}

}