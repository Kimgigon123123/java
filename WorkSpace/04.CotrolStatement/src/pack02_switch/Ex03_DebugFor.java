package pack02_switch;

import java.util.Scanner;

public class Ex03_DebugFor {
	public static void main(String[] args) {
		//Bug(����): �˼�����(������x) ������ �����鼭 ���α׷��� ���� �۵��� ���� ��.
		//Debug: ������ ã�Ƽ� �ٷ� ��� ����(����)
		//������� �ſ� �߿���.
		//�극��ŷ(ũ) ����Ʈ(�ߴ���):���α׷��� ������ �Ʒ��� ���������� ������ �Ѵ�.
		//Ư�� ��(����)�� ���߰� �ش��ϴ� �������� ������ ��Ȳ�� ���� Ȯ���� �� �� �ִ� ��(����Ʈ)
		//1~10��° �ٱ��� ���α׷��� ���� ��. �踦 �̿��ؼ� Ư����(5)���� ����.
		Scanner sc= new Scanner(System.in);
		String inputData=sc.nextLine();
		int userNum=Integer.parseInt(inputData);//���� �ܿ� ���� �ԷµǸ� int������ �ٲٴٰ� ����
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		
		//�����Ӱ� ����� ��带 Ȱ���غ���
		// �� ���� for�� ���ÿ� �극��ŷ����Ʈ�� �ְ� ����µ� i���� �Ⱥ�������??
		
		for(int i=0;i<10;i++) {//�ݺ��� ����(��)�� �극��ŷ ����Ʈ�� �ɸ� �ȵ� Ȯ�� ����.
			System.out.println(i);
		}
		
		
		
		
		
		
	}

}
