package pack03_constructor;

import java.util.Scanner;

public class Test01 {
	//이름,아이디,패스워드,나이를 필드로 사용하는 Member 클래스를 생성후 Member클래스 필드값에
	//값을 할당하고 출력해보기.
	
	String name;
	String id;
	String pw;
	String age;

	public Test01(String uName, String uID, String uPw, String uAge) {
		super();
		this.name = uName;
		this.id = uID;
		this.pw = uPw;
		this.age = uAge;
	}
	
	


//	public static void main(String[] args) {
//		System.out.println("이름을 입력하세요");
//		Scanner sc= new Scanner(System.in);
//		String uName=sc.nextLine();
//		
//		System.out.println("ID를 입력하세요");
//		
//		String uID=sc.nextLine();
//		
//		System.out.println("비번을 입력하세요");
//		
//		String uPw=sc.nextLine();
//		
//		System.out.println("나이를 입력하세요");
//	
//		String uAge=sc.nextLine();
//		
//		Test01 info =new Test01(uName,uID,uPw,uAge);
//		System.out.println(info.name);
//		System.out.println(info.id);
//		System.out.println(info.pw);
//		System.out.println(info.age);
//	}
	
	//2. 이름 아이디 패스워드 나이를 필드로 사용하는 MemberDTO 클래스를 생성한다.
	
	//3. 필수로 입력이 되어야 할 것 같은 필드는 생성자를 통해서 입력을 받게 만들고
	//해당내용을 출력한다.
	


}
