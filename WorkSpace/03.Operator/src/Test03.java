import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//���׿����� �Ǵ� ���׿����ڸ� �̿��ؼ� ����Ǯ���.
		//Scanner�̿��غ���
		
		
		
		//�ܼ�â�� ���ؼ� �Է¹޾ƿ� String�����͸� int�� �ٲ��� �ش�
		//���ڰ� ¦������ �Ǵ� Ȧ�� ���� �Ǵ��Ͽ�
		//�ܼ�â�� ����ϼ���
		
		//�ܼ�â�� ���ؼ� String ������ (����) �ΰ� �Է� �޴´�.
		//������ ���ڴ� num1�� num2�� �����Ѵ�.
		//�μ����� ���ϱ� ���� ���ϱ� ������ �� ����� ����ϱ�
		
		// �� ������ �� ū ���ڰ� � �������� ǥ���ϱ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�");
		System.out.println(Integer.parseInt(sc.nextLine())%2==1? "Ȧ��":"¦��");
		
		int num1=Integer.parseInt(sc.nextLine());
		int num2=Integer.parseInt(sc.nextLine());
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		String result=num1==num2? "����": num1 <num2 ? "num2�� ŭ":"num1�� ŭ";
		System.out.println(result );
		//method(�޼ҵ�)==�̸� �������� ����� ȣ���ؼ� ����Ѵ�==?
		
		
	}

}
