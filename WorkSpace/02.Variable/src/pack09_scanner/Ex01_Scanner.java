package pack09_scanner;

import java.util.Scanner;

public class Ex01_Scanner {public static void main(String[] args) {
	//Scanner (�Է�)=>�ڹ�(���)=>�ܼ�
	Scanner sc  = new Scanner(System.in);
	// �ܺο��������� �����͸� ����غ������ؼ� �ܿ��� ��� o
	System.out.println("������ �Է��ϼ���");
	String inputData = sc.nextLine();//���� ����Ű ġ���������� ���ڿ��� ������
	//���ڸ� �ΰ� �޾ƿͼ� �� �� �� ���� ���ϱ�. ���̵� ߾
	System.out.println(inputData);
	int score =Integer.parseInt(inputData);
	System.out.println(score+10+"��");
	//1.�ܺο��� �Է��� ���ڴ� String���·� inpuData��� ������ ���´�.
	//�����Ϳ� +10 �� ����� ����غ�����.
	
	Scanner sss = new Scanner(System.in);
	System.out.println("���ھƹ��ų��Է�");
	String number = sss.nextLine();
	int number2=Integer.parseInt(number);
	System.out.println(number2+20);

	//Scanner sc  = new Scanner(System.in);
	//String inputData = sc.nextLine();
	
	
	Scanner sc2=new Scanner(System.in);
	System.out.println("���ڸ� �Է��Ͻÿ�");
	String input1 = sc2.nextLine();
	System.out.println("���ڸ� �Է��Ͻÿ�");
	String input2 = sc2.nextLine();
	int kkk=Integer.parseInt(input1);
	int qqq=Integer.parseInt(input2);
	System.out.println(kkk+qqq);
	
	
	

	
}


}
