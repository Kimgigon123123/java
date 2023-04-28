package pack;

import java.util.Random;
import java.util.Scanner;

public class Phone1DAO {
	
	void displayMyPhone(Phone1DTO ph1dto) {
		System.out.println("당신의 핸드폰");
		System.out.println("색상: "+ph1dto.getColor());
		System.out.println("색상: "+ph1dto.getModel());
	}
	
	void turnOn(Phone1DTO ph1dto) {
		ph1dto.setState("켜짐");
		System.out.println("현재상태는 ["+ph1dto.getState()+"]입니다");
	}
	
	void turnOff(Phone1DTO ph1dto) {
		ph1dto.setState("꺼짐");
		System.out.println("현재상태는 ["+ph1dto.getState()+"]입니다");
	}
	
	int selectNum() {
		Scanner sc = new Scanner (System.in);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	void meCall() {
		Scanner sc = new Scanner(System.in);
		System.out.println("(말하세요)");
		String meCall=sc.nextLine();
		System.out.println("나 : "+meCall);
	}
	void youCall() {
		Random random= new Random();
		String[] youCallArr = {"여보세요","안녕","ㅎㅇ","아무말","가나다라마바사"};
		int youCall = random.nextInt(5);
		System.out.println("상대방 : "+youCallArr[youCall]);
	}
	
	
}
