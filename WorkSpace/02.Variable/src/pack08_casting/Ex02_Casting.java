package pack08_casting;

public class Ex02_Casting {public static void main(String[] args) {
	//���ڿ� = "12" + 34
	System.out.println("12"+34);
	String a="12";
	int b=34;
	System.out.println(a+b);
	// ���ڿ� + ���= ���ڿ� ��Ģ
	// Kgg(���ڿ�)+10=?
	// ���ڿ� ������ ��Ģ ��
	// "1"(String) �ٸ��� 1(����)
	String sum="12"+34;
	// � ���� String���� �ٲٴ°��� ��û���� �����ϴ�.
	String sum2=""+1234+10;//��� �ٲٸ� String�� �ɱ�?
    System.out.println(sum2);
    
    // String sum, sum2 ������ ���ڿ��� ���ڸ� �����ص�.
    // �ΰ��� ���� �˰�ʹ�. "1234" + "1234"
    // sum+sum2=12341234
    // ���� 1234+1234=2468�� ����� �����Ѵ�
    // String => int ?
    // int, double ���� ��������� �۾� �ٲ�°� =>�⺻Ÿ��
    // �빮�ڷ� �����ϴ� �͵��� ��κ� ClassŸ��
    // �⺻ ������ Ÿ���� Wrapper class ��°��� ������ �ִ�.
    // �� int => Integer, double => Double
    // String�� �ش��ϴ� Ÿ������ �ٲ��ִ� ������ �ϴ°�
    // String�� �ִ� ""<=�� �����Ѵ�.
    int num =Integer.parseInt (sum) +1234;
    System.out.println(num);
    // num2�� sum2�� ���ڷ� �ٲ㼭 �־��
   
    int num2=Integer.parseInt(sum2);
    System.out.println(num2+sum2);
    
    String sAvg="88.6";
    // +10�� �� ����� ��� ����. (98.6)
    //sAvg<=double���·� �ٲٴ°��غ���
    double dAvg=Double.parseDouble(sAvg)+10;
    System.out.println(dAvg);
    
    String sss="234";
    int iii=Integer.parseInt(sss)+6;
    System.out.println(iii);
    //WrapperClass.parseDateType(String);=>DataType
    
    //Float.parseFloat(sAvg)
    //Long.parseLong(sAvg)
    //Byte.parseByte(sAvg)
    
    String str="����";
    //�� �ش� �����͸� ���ڷ� �ٲܼ�������? wrapperclass�̿�
    
    int i1=Integer.parseInt(str);
    //�ܼ�â�� Ȯ���ϱ� (������==����)
    System.out.println(i1);
    
}

}
