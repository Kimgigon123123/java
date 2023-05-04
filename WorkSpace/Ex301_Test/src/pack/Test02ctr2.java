package pack;

import java.util.Scanner;

public class Test02ctr2 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String id;
		String pw;
		System.out.println("아이디를 입력하세요");
		id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		pw = sc.nextLine();
		System.out.println("로그인 중입니다");
		
		
		if(id.equals("admin")&&pw.equals("admin1234")) {
			System.out.println("관리자님 환영합니다");
		}
		else {
			System.out.println("잘못된 접근입니다");
		}
		
		
		
		
		
	}
	
	
	
}
