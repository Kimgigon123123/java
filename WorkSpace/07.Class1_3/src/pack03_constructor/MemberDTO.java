package pack03_constructor;

import java.util.Scanner;

public class MemberDTO {
	public static void main(String[] args) {
		System.out.println("이름을 입력하세요");
		Scanner sc= new Scanner(System.in);
		String uName=sc.nextLine();
		
		System.out.println("ID를 입력하세요");
		
		String uID=sc.nextLine();
		
		System.out.println("비번을 입력하세요");
		
		String uPw=sc.nextLine();
		
		System.out.println("나이를 입력하세요");
	
		String uAge=sc.nextLine();
		
		Test01 info =new Test01(uName,uID,uPw,uAge);
		System.out.println("이름:"+info.name);
		System.out.println("ID:"+info.id);
		System.out.println("PW:"+info.pw);
		System.out.println("나이:"+info.age);
	}

}
