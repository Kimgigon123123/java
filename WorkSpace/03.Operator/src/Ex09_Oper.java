
public class Ex09_Oper {public static void main(String[] args) {
	// int result = num < 10? 1:��2?��3....:������ ���̾ƴҶ�
	//scoce��� ������ ���� �ش� ������ ���� 90���� ũ�ٸ� A���.
	//80���� ũ�ٸ� B���...D���
	
	int score2=55;
	String grade2=score2>90? "���":"�̴�";
	System.out.println(grade2);
	
	int score=91;
	String grade = score >90? "A": score >80? "B": score >70? "C":score>60? "D":"E";
	System.out.println(grade);
}

}