
public class Test06 {public static void main(String[] args) {
	//test06 Ŭ������ �ϳ������ int�� ������ �����Ͽ� 5�� �����ϰ� 
		//���� ������ ���� ������ �����ϱ� ���� �뵵�̴�.(�̸��� ���� �ұ�?)
		//����,����,����,����,ü��
		
		
	 int kor,math,eng,sci,phy;
	 kor=10;
	 math=20;
	 eng=30;
	 sci=40;
	 phy=50;
	 System.out.println(kor);
	 
	 //����ȯ(Casting) : ���� �ٸ� Ÿ���� ������ ��ȯ���� �����
	 // ex) int <-> double , String <-> int
	 // int < double
	 int iValue=10;
	 double dValue=iValue+0.5; // �ƹ��͵� �Ѱ� ���� ==> �ڵ� ����ȯ
	 System.out.println("iValue �� : "+iValue);
	 System.out.println("dValue �� : "+dValue);
	 iValue=(int)dValue; // ������ �߻��� = ������ ����
	 
	 System.out.println("iValue �� : "+iValue);
	 System.out.println("dValue �� : "+dValue);
	 
	 
	 
	 String str="1234"+12;
	 //���ڿ��� � ���� ���ϴ� �� == ��x => ���� (������ ��ħ)
	 int iData=1234+12;
	 System.out.println(str);
	 System.out.println(iData);
	 //str���� ���� 123412��� ���ڿ��� �Ǿ�����.
	 //���ڷ� �ٲٷ��� ��� �ؾ��ұ�? (""<=����)
	 
	 int sum=Integer.parseInt(str)+1;
	 System.out.println(sum);
	 
	 // boolean (�ο���) true �Ǵ� false �� ������ ������.
	 
	 String sum1=""+123+123+"������";
	 System.out.println(sum);
	 
	 String aaa="10";
	 int bbb=Integer.parseInt(aaa)+1;
	 System.out.println(bbb);
	
	double doubleNum=10.99999999;
	int intNum=(int)doubleNum+20;
	System.out.println(intNum);
	
	double ccc=Double.parseDouble(aaa)+23;
	System.out.println(ccc);
	
	double doNum=20.333;
	int inNum=(int)doNum;
	System.out.println(inNum);
}

}
