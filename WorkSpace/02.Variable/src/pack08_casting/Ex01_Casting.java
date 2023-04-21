package pack08_casting;

public class Ex01_Casting {
	public static void main(String[] args) {
		int iNum = 10 ; //������ ���� a�� �ʱ�ȭ �ϰ� 10�� ��Ƶ�
		double dNum = iNum; //�� ū Ÿ�Կ� ���� Ÿ���� ������ �ڵ�
		                    // ��ȯ�� �Ͼ ( �ڵ� ����ȯ )
		System.out.println(iNum);
		System.out.println(dNum);
		//�ڵ�����ȯ�� �߻��� ���� Ÿ��(int)=> ū Ÿ�� (double)
		// ������ ����ȯ, Upcasting
		
		
		double dNum2=30.5;
		//int iNum2 = dNum2; ūŸ�� => ���� ������ Ÿ��
		
		int iNum2=(int) dNum2 ;
		//����� ����ȯ, DownCasting ==>Casting�� �Ϲ����� �ǹ�
		System.out.println(dNum2);
		System.out.println(iNum2);
	    //downCasting�� ������ �߻���. ǥ���Ҽ����� �����͸� ��������.
		//�������� �ŷڼ�, ���ռ��� ������ ���ɼ��� ũ�⶧���� ����
		
		// long => int, int=>float
		//���� ���ڸ� ǥ���ϴ� ������ Ÿ�Գ����� ������.
		// int������ �ʱ�ȭ�ؼ� �ϳ� �����(������ ����) �� ���.(����)
		//byte�� ������ ��ƺ���
		//1. ���� Casting�ϱ�?
		//2. �����ڵ��ۼ�
		
		int i=-256;
		byte bNum=(byte) i;
		System.out.println(bNum);

		int iNumA=50;
		byte bNum2= (byte) iNumA;
		System.out.println(bNum2);
 	   
	}

}
