import java.util.Random;
import java.util.Scanner;

//2023 - 04 - 07 
// �ۼ��� : �迵��
// ���� : ���� �ǵ��
// num++; �κ� if�� �ٱ������� ���ø� �ߺ��ڵ尡 �ٰ� , ������߸� �õ�Ƚ�� ������ �������ϴ�.
// �׿ܿ��� ���ϽŰͰ����ϴ�. ����ϼ̽��ϴ�.
public class ���� {
	public static void main(String[] args) {
		int random = new Random().nextInt(100)+1;// 1~100������ �� ä��

		Scanner sc = new Scanner(System.in);

		System.out.println(random);

		int num=0;

		

		while(true) {

			System.out.println("1~100 ���� �Է�");

			String inputData = sc.nextLine();

			int i=Integer.parseInt(inputData);

			if(random>i) {

				num++;

				System.out.println("�� ū ���� �Է��ϼ���");

			}

			else if(random<i) {

				num++;

				System.out.println("�� ���� ���� �Է��ϼ���");

			}

			else{

				System.out.println("����");

				System.out.println((num+1)+"�� �õ� �ϼ̽��ϴ�");

				break;

			}

		}
		
Scanner sc2=new Scanner(System.in);

		

		while(true) {

			

			System.out.println("���������� �Է��ϼ���");

			int kor=Integer.parseInt(sc2.nextLine());

			if(kor>100||kor<0) {

				System.out.println("�ٽ��Է�");

			}else {

				System.out.println("���������� �Է��ϼ���");

				int eng=Integer.parseInt(sc2.nextLine());

				if(eng >100||eng <0) {

					System.out.println("�ٽ��Է�");

				}else {

					System.out.println("���������� �Է��ϼ���");

					int mat=Integer.parseInt(sc2.nextLine());

					if(mat >100 || eng<0) {

						System.out.println("�ٽ��Է�");

						

					}else {

						System.out.println("����="+(kor+eng+mat));

						System.out.println("���="+(kor+eng+mat)/3);

						break;

					}

				}

			}

		}
	}
}
