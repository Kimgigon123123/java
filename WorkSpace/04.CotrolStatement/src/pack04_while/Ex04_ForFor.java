import java.util.Scanner;

public class Ex04_ForFor {
	public static void main(String[] args) {
	//����� �����ϰ� ��ø�� �����ϴ�.(����x)
	// 1~10���� �ݺ��ϰ� for�� ������
	for(int i=1 ; i<=10;i++) {
		System.out.println(i);
		for(int j=1 ; j<=10;j++) {
			System.out.println(j);
		}
		//for���� �ϳ� �� ���� �� ������?
		//for�� �ϳ� �� �־��(��ø)
		//�� ��ȸ ������ �ұ�? 1for * 2for = 10*10=100
		
	}

	System.out.println("-----");

	//�������� ����غ��� .print�� println�� ������ ����Ͽ�.
	// 2x1=2
	// 2x2=4
	//��¿��� 2x1=2, 2x2=4, 2x3=6
	int sum=0;
	for(int num1=2; num1<=9; num1++) {
		sum=num1;
		System.out.println(num1+"��");
		for(int num2=1;num2<=9;num2++) {
			System.out.println(sum+"X"+num2+"="+(num2*sum));
		}
	}
	System.out.println("------");
	for(int i =2;i<=9;i++) {
		System.out.println(i+"X"+1+"="+(i*1));
		for(int j=1;j<=9;j++) {
			System.out.print(i+"X"+j+"="+(i*j)+"   ");
		}
		System.out.println();
	}
	
	
	//���� for���� �̿��ؼ�  �����
	// ��
	// �ڡ�
	// �ڡڡ�
	// �ڡڡڡ�
	// �ڡڡڡڡ�
	System.out.println("A");
	System.out.print("B");
	System.out.println("C");
	System.out.println("D");
	System.out.print("E");
	System.out.print("F");
	System.out.print("G");
	System.out.println();
	
	
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=i;j++) {
			System.out.print("��");
		}System.out.println();
	}
	
	for(int i=1;i<=3;i++) {
	
		for(int j=1;j<=i;j++) {
			System.out.print("��");
		}System.out.println();
	}

	
	
	//System.out.println("��");
	//System.out.println("�ڡ�");
	//System.out.println("�ڡڡ�");
	//System.out.println("�ڡڡڡ�");
	//System.out.println("�ڡڡڡڡ�");
	
	//2~9�ݺ�<-����ڰ� �Է��� Ƚ��
	//1~9�ݺ�
	//���빮�� Scanner�� 
	//�̿��ؼ� ���ڸ� �Է� �޴´�.
	// �Է� ���� ���ڱ����� 
	//�������� ����ϴ� 
	//for���� ������
	//2�̸��� ���ڸ�
	// �Է��ϸ� �������� ���x 
	// -> �߸��� ���ڶ�� �ܼ�â�� ��¸���
	// 2�̻��� ���ڰ� �ԷµǸ� �ش��ϴ� �ܱ����� �������� ����ϱ�
	
	Scanner sc= new Scanner (System.in);
	String inputData = sc.nextLine();
	int iNum=Integer.parseInt(inputData);
	if(iNum>=2&&iNum<=9) {for ( int i=1; i<=9 ; i++) {
		System.out.print(iNum+"X"+i+"="+(iNum*i)+"\t");
	}
	
	}else {
		System.out.println("�߸��� ����");
	}
	
	Scanner sc2=new Scanner(System.in);
	String inputData2=sc2.nextLine();
	int iNum2=Integer.parseInt(inputData2)
	
}
}	

