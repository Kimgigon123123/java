package pack09_scanner;

import java.util.Scanner;

public class Ex02_Scanner {public static void main(String[] args) {
	//�μ� ���ϱ�
	Scanner sc=new Scanner(System.in);
	System.out.println("���ڸ� �Է��Ͻÿ�");
	String input1 = sc.nextLine();
	System.out.println("���ڸ� �Է��Ͻÿ�");
	String input2 = sc	.nextLine();
	int sum1=Integer.parseInt(input1);
	int sum2=Integer.parseInt(input2);
	System.out.println(sum1+sum2);
	
	//�������
	Scanner avg_sc=new Scanner(System.in);
	System.out.println("���� ������ �Է��ϼ���");
	String kor_score=avg_sc.nextLine();
	System.out.println("���� ������ �Է��ϼ���");
	String math_score=avg_sc.nextLine();
	int kor = Integer.parseInt(kor_score);
	int math = Integer.parseInt(math_score);
	System.out.println("����� "+(kor+math)/2+"��");
	
	//���̱��ϱ�
	Scanner age_sc=new Scanner(System.in);
	System.out.println("����� �¾ �⵵��? ex)xxxx");
	String year=age_sc.nextLine();
	int age=2023-Integer.parseInt(year);
	System.out.println("��"+age+"��");
	
	//�Ҽ������ֱ�
	Scanner product_sc=new Scanner(System.in);
	System.out.println("�Ҽ����� �Է��ϼ���");
	String number22=product_sc.nextLine();
	double prod=Double.parseDouble(number22);
	int iNum=(int)prod;
	System.out.println(iNum);
	
	
	
	
	
	
	
	

}

}
