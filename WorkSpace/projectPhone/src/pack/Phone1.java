package pack;

import java.util.Scanner;

public class Phone1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		Phone1DTO ph1dto = new Phone1DTO("검정","애플","꺼짐");
		Phone1DAO ph1dao = new Phone1DAO();
		
		ph1dao.displayMyPhone(ph1dto);
		System.out.println();
		
		while(true) {
			
			System.out.println("전원을 켜시겠습니까?");
			System.out.println("1.O 2.X");
			
			int selectNum=ph1dao.selectNum();
			
			if(selectNum==1) {
				while(true) {
					ph1dao.turnOn(ph1dto);
					System.out.println("1. 전화하기 2. 전원끄기");
					selectNum=ph1dao.selectNum();
					
						
						if(selectNum==1) {
							while(true) {
								System.out.println("1.말하기 2.듣기 3.전화끊기");
								selectNum=ph1dao.selectNum();
								if(selectNum==1) {
									ph1dao.meCall();
								}
								else if(selectNum==2) {
									ph1dao.youCall();
									
								}
								else if(selectNum==3) {
									System.out.println("전화를 끊습니다");
									break;
								}
							}
							
							
						}
						else if(selectNum==2) {
							ph1dao.turnOff(ph1dto);
							break;
						}
							
				}
				
				
				
			}
			else if(selectNum==2) {
				ph1dao.turnOff(ph1dto);
				
			}
			
		}
		
		
		
		
		
		
		
 }
}