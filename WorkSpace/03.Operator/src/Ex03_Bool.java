
public class Ex03_Bool {public static void main(String[] args) {
	// true �� false�� ���尡���� ����Ÿ����?
	// true (1) , false (0)
	// AND ������ & , OR ������ |
	// or �����ڴ� ������? true(1) + false(0) = true(�������� �ϳ��� true�� ��ü
	// ���ǽ��� true�� ����)
	// �����ϴ� ������ 1���� �̻� �������ּ���.( ����1=���� , ����2 , ����3 )
	// and �����ڴ� ������? true(1) * false(0) = false ( �������� ��� ������ true
	//   �϶��� true��)
	// �α��� (���̵� �°� (true) * ��й�ȣ�� �°� (true) => true )
	
	// not => !
	// � true, false(bool)�տ� ���̸� �ش� ����� ������Ŵ.
	
	
	boolean boolT=true;
	boolean boolF=false;
	
	System.out.println(boolT);
	System.out.println(boolF);
	
	System.out.println(!boolT);
	System.out.println(!boolF);
	
}

}