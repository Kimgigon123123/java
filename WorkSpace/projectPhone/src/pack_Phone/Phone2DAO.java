package pack_Phone;

import java.util.Scanner;

public class Phone2DAO extends Phone1DAO {
	
	
	
	
	
	//----------------------------------//
	void currentStatus(Phone1DTO pho1dto, Phone2DTO pho2dto) {//현재상태 나타내주기
		System.out.println("현재 전원상태는 ["+pho1dto.getState()+"]입니다");
		System.out.println("현재 통화상태는 ["+pho1dto.getCallMode()+"]입니다");
		System.out.println("현재 DMB상태는 ["+pho2dto.getDmbMode()+"]입니다");
		System.out.println();
	}
	//------------------------//
	void dmbOn(Phone2DTO pho2dto,Phone1DTO pho1dto) {//dmb켜기
		
		Scanner sc = new Scanner(System.in);
		
		if(pho1dto.getState().equals("꺼짐")) {
			System.out.println("전원이 꺼져있습니다");
			System.out.println("(아무키나 누르세요)");
			sc.nextLine();
			
		}
		else if(pho1dto.getState().equals("켜짐")) {
			if(pho1dto.getCallMode().equals("ON")) {
				System.out.println("전화중에는 방송을 켤 수 없습니다");
				System.out.println("(아무키나 눌러주세요)");
				sc.nextLine();
			}
			else if(pho1dto.getCallMode().equals("OFF")){
				
				if(pho2dto.getDmbMode().equals("OFF")) {
				System.out.println("DMB방송모드를 켭니다");
				System.out.println("현재채널 : "+pho2dto.getChannel());
				pho2dto.setDmbMode("ON");
				System.out.println("(아무키나 눌러주세요)");
				sc.hasNextLine();
			}
			else if(pho2dto.getDmbMode().equals("ON")) {
				System.out.println("이미 방송이 켜져있습니다.");
				System.out.println("(아무키나 눌러주세요)");
				sc.nextLine();
			}
				
			}

		}
	}
	//--------------------------------------------//
	
	void dmbOff(Phone1DTO pho1dto,Phone2DTO pho2dto,Phone1DAO pho1dao) {// dmb끄기 / 채널변경
		Scanner sc = new Scanner(System.in);
		
		if(pho2dto.getDmbMode().equals("OFF")) {
			System.out.println("방송이 꺼져 있습니다");
			System.out.println("(아무키나 눌러주세요)");
			sc.nextLine();
		}
		else if (pho2dto.getDmbMode().equals("ON")) {
			System.out.println("1. 방송끄기 2. 채널변경");
			int num=pho1dao.selectNum();
			
			if(num==1) {
				System.out.println("방송을 끕니다.");
				pho2dto.setDmbMode("OFF");
				System.out.println("(아무키나 눌러주세요)");
				sc.nextLine();
			}
			else if(num==2) {
				System.out.println("1~10까지 변경할 채널을 입력해주세요");
				num=pho1dao.selectNum();
			}
		}
	}
	
	
	
	
	
}
