package pack;

import java.util.Scanner;

public class Test05MemberServiceExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test05MemberServiceExample ms = new Test05MemberServiceExample();
		
		String userId= sc.nextLine();
		String userPw= sc.nextLine();
		
		
		if( ms.login(userId, userPw)) {
			System.out.println("로그인 되었습니다.");
			ms.logout(userId);
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
	}
	
	boolean login(String id,String pw) {
		
		if(id.equals("hong")&&pw.equals("12345")) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다");
	}
	
	
	
	
	
}
