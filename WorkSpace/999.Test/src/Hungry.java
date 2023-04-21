import java.util.Scanner;

public class Hungry {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("너의 상태를 입력하세요");
		int myCondition = Integer.parseInt(sc.nextLine());
		if(myCondition==-1) {
			System.out.println("배고파");
		}
	}

}
