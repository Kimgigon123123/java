package pack;

import java.util.Scanner;

public class temp2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		String state="꺼짐";
		
		while(true) {
			System.out.println("현재상태는 ["+state+"]입니다");
			
			System.out.println("켜시겠습니까? 1.O  2.X");
			int select=Integer.parseInt(sc.nextLine());
			
			if(select==1) {
				state="켜짐";
			}
			else if (select==2) {
				state="꺼짐";
				break;
			}
		
			while(state.equals("켜짐")) {
				System.out.println("현재상태는 ["+state+"]입니다");
				
				if(state.equals("켜짐")){
					System.out.println("1.전화하기 2. 전원끄기 3.아무것도 안하기");
					
					select=Integer.parseInt(sc.nextLine());
					if(select==1) {
						state="전화중";
					}
					else if(select==2) {
						state="꺼짐";
					}
					
					if(state.equals("전화중")) {
						while(true) {
						System.out.println("1. 말하기 2.듣기 3. 끊기");
							select = Integer.parseInt(sc.nextLine());
							if(select==1) {
								System.out.println("(말하세요)");
								String call=sc.nextLine();
								System.out.println("나: "+call);
							}
							else if(select==2) {
								System.out.println("상대: ㅎㅇ");
							}
							else if(select==3) {
								System.out.println("전화를 끊습니다");
								state="켜짐";
								break;
							}
						}
						
						
					}
			}
			
			}
		}
		
	}
	
}
