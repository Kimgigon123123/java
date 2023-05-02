package pack_Phone;

import java.util.Scanner;

public class Phone2DAO extends Phone1DAO {
	
	
	
	
	
	//----------------------------------//
	void currentStatus(Phone2DTO pho2dto) {//현재상태 나타내주기
		System.out.println("현재 전원상태는 ["+pho2dto.getState()+"]입니다");
		System.out.println("현재 통화상태는 ["+pho2dto.getCallMode()+"]입니다");
		System.out.println("현재 DMB상태는 ["+pho2dto.getDmbMode()+"]입니다");
		System.out.println();
	}
	//------------------------//
	
	void turnOff(Phone2DTO pho2dto) {
		System.out.println("전원을 끕니다");
		pho2dto.setState("꺼짐");
		pho2dto.setCallMode("OFF");
		pho2dto.setDmbMode("OFF");

	}
	
	//--------//
	
	void turnOnOff(Phone2DTO pho2dto) { //전원 꺼져있으면 켜지고, // 전원 켜져있으면 꺼짐
		if(pho2dto.getState().equals("꺼짐")) {
			turnOn(pho2dto);
			
		}
		else if(pho2dto.getState().equals("켜짐")) {
			turnOff(pho2dto);
		}
	}
	//-----------------------//
	
	void call(Phone2DTO pho2dto) {// 전화모드
		Scanner sc = new Scanner(System.in);
		
		
		
		if (pho2dto.getState().equals("켜짐")) { 
			
			if (pho2dto.getDmbMode().equals("ON")) {  //DMB켜져 있으면 전화불가
				System.out.println("DMB방송 시청중일때는 전화를 할 수 없습니다");
				System.out.println("(아무키나 눌러주세요)");
				sc.nextLine();
				
			} else if (pho2dto.getDmbMode().equals("OFF")) { //DMB 꺼져 있으면 전화가능
				
				if (pho2dto.getCallMode().equals("OFF")) {
					System.out.println("전화모드ON");
					System.out.println("음성전송&수신 가능");
					pho2dto.setCallMode("ON");
					System.out.println("(아무키나 누르세요)");
					sc.nextLine();
					System.out.println();
					
				} else if (pho2dto.getCallMode().equals("ON")) {
					System.out.println("전화모드OFF");
					System.out.println("음성전송&수신 불가");
					pho2dto.setCallMode("OFF");
					System.out.println("(아무키나 누르세요)");
					sc.nextLine();
					System.out.println();
				}
			}

		} else if (pho2dto.getState().equals("꺼짐")) {  //전원꺼져있으면 전화불가

			System.out.println("전원이 꺼져있습니다");
			System.out.println("(아무키나 눌러주세요)");
			sc.nextLine();
		}
	}

	
	
	
	

	//-----------------------//
	
	
	
	void dmbOn(Phone2DTO pho2dto) {//dmb켜기
		
		Scanner sc = new Scanner(System.in);
		
		if(pho2dto.getState().equals("꺼짐")) {
			System.out.println("전원이 꺼져있습니다");
			System.out.println("(아무키나 누르세요)");
			sc.nextLine();
			
		}
		else if(pho2dto.getState().equals("켜짐")) {
			if(pho2dto.getCallMode().equals("ON")) {
				System.out.println("전화중에는 방송을 켤 수 없습니다");
				System.out.println("(아무키나 눌러주세요)");
				sc.nextLine();
			}
			else if(pho2dto.getCallMode().equals("OFF")){
				
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
	
	void dmbOff(Phone2DTO pho2dto,Phone2DAO pho2dao) {// dmb끄기 / 채널변경
		Scanner sc = new Scanner(System.in);
		
		if(pho2dto.getDmbMode().equals("OFF")) {
			System.out.println("방송이 꺼져 있습니다");
			System.out.println("(아무키나 눌러주세요)");
			sc.nextLine();
		}
		else if (pho2dto.getDmbMode().equals("ON")) {
			System.out.println("1. 방송끄기 2. 채널변경");
			int num=pho2dao.selectNum();
			
			if(num==1) {
				System.out.println("방송을 끕니다.");
				pho2dto.setDmbMode("OFF");
				System.out.println("(아무키나 눌러주세요)");
				sc.nextLine();
			}
			else if(num==2) {
				System.out.println("1~10까지 변경할 채널을 입력해주세요");
				num=pho2dao.selectNum();
				pho2dto.setChannel(num);
				System.out.println("현재채널 : "+pho2dto.getChannel());
				System.out.println("(아무키나 눌러주세요)");
				sc.nextLine();
			}
		}
	}
	
	
	
	
	
}
