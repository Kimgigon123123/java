package pack03_Decimal;

public class Ex01_Decimal {public static void main(String[] args) {
	int i=1234567890;
	System.out.println(i);
	//int �̻��� ���� ���� �� �ִ� ������ ������Ÿ���� ������.
	//long�� l1�̶�� ������ �����ϱ�.
	//long�� l2��� ������ �ʱ�ȭ ��Ű��.
	//long�� l2��� ������ �ʱ�ȭ ��Ű��.12345678901
	long l1;
	long l2 = 1234567890123456789L; //����+longŸ���̶�� ������
	System.out.println(l2);
	
	//�Ǽ��� ������ Ÿ�� : float , double
	//�Ǽ����� �Ҽ����� �ִ°��� ǥ���ϱ� ���� ����
	// float�� long�� ���������� ������ F�� �ٿ���߸���
	//����) ������Ÿ�� float�� ����Ͽ� ���� ����, �Ҵ�, �ʱ�ȭ
	
	float kkk;
	kkk = 1.23F;
	double qqq;
	qqq = 3.21;
	System.out.println(kkk);
	System.out.println(qqq);
	//��ǥ�� : int, double
	// �ڿ� �����ڰ� �ٴ� long, float�� ����
	
}

}