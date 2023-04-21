package practice;

import java.util.Scanner;

public class Practice02Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String uName=sc.nextLine();
		
		System.out.println("ID를 입력하세요");
		
		String uID=sc.nextLine();
		
		System.out.println("비번을 입력하세요");
		
		String uPw=sc.nextLine();
		
		System.out.println("나이를 입력하세요");
	
		String uAge=sc.nextLine();
		practice02 info=new practice02(uName,uID,uPw,uAge);
		
		System.out.println(info.name);
		System.out.println(info.id);
		System.out.println(info.pw);
		System.out.println(info.age);
		
		
	}

}
