package pack.lotto;

import java.util.Random;
import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
		lottoDTO[] lotArr = new lottoDTO[45];
		
		for(int i=0; i<lotArr.length;i++) {
			lotArr[i]=new lottoDTO(i+1,1);
		}
		
		Random random=new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("로또를 시작합니다");
		System.out.println("6개의 숫자를 모두 맞히면 1000억!");
		sc.nextLine();
		
		
		int userSelect1=0;
		int userSelect2=0;
		int userSelect3=0;
		int userSelect4=0;
		int userSelect5=0;
		int userSelect6=0;
		
		System.out.println("첫번째 숫자를 입력해주세요");
		userSelect1=Integer.parseInt(sc.nextLine());
		
		System.out.println("["+userSelect1+"]"+"["+userSelect2+"]"+"["+userSelect3+"]"+"["+userSelect4+"]"+"["+userSelect5+"]"+"["+userSelect6+"]");
		
		
		
		
		System.out.println("두번째 숫자를 입력해주세요");
		userSelect2=Integer.parseInt(sc.nextLine());
		while(true) {
			if(userSelect1==userSelect2) {
				System.out.println("중복된 숫자입니다");
				System.out.println("다시 입력해주세요");
				userSelect2=Integer.parseInt(sc.nextLine());
			}
			else {
				break;
			}
		}
		
		System.out.println("["+userSelect1+"]"+"["+userSelect2+"]"+"["+userSelect3+"]"+"["+userSelect4+"]"+"["+userSelect5+"]"+"["+userSelect6+"]");
		
		
		
		
		System.out.println("세번째 숫자를 입력해주세요");
		userSelect3=Integer.parseInt(sc.nextLine());
		while(true) {
			if(userSelect1==userSelect3||userSelect2==userSelect3) {
				System.out.println("중복된 숫자입니다");
				System.out.println("다시 입력해주세요");
				userSelect3=Integer.parseInt(sc.nextLine());
			}
			else {
				break;
			}
		}
		
		System.out.println("["+userSelect1+"]"+"["+userSelect2+"]"+"["+userSelect3+"]"+"["+userSelect4+"]"+"["+userSelect5+"]"+"["+userSelect6+"]");
		
		
		
		System.out.println("네번째 숫자를 입력해주세요");
		userSelect4=Integer.parseInt(sc.nextLine());
		while(true) {
			if(userSelect1==userSelect4||userSelect2==userSelect4||userSelect3==userSelect4) {
				System.out.println("중복된 숫자입니다");
				System.out.println("다시 입력해주세요");
				userSelect4=Integer.parseInt(sc.nextLine());
			}
			else {
				break;
			}
		}
		
		System.out.println("["+userSelect1+"]"+"["+userSelect2+"]"+"["+userSelect3+"]"+"["+userSelect4+"]"+"["+userSelect5+"]"+"["+userSelect6+"]");

		
		
		System.out.println("다섯번째 숫자를 입력해주세요");
		userSelect5=Integer.parseInt(sc.nextLine());
		while(true) {
			if(userSelect1==userSelect5||userSelect2==userSelect5||userSelect3==userSelect5||userSelect4==userSelect5) {
				System.out.println("중복된 숫자입니다");
				System.out.println("다시 입력해주세요");
				userSelect5=Integer.parseInt(sc.nextLine());
			}
			else {
				break;
			}
		}
		
		System.out.println("["+userSelect1+"]"+"["+userSelect2+"]"+"["+userSelect3+"]"+"["+userSelect4+"]"+"["+userSelect5+"]"+"["+userSelect6+"]");
		
		
		
		
		System.out.println("여섯번째 숫자를 입력해주세요");
		userSelect6=Integer.parseInt(sc.nextLine());
		while(true) {
			if(userSelect1==userSelect6||userSelect2==userSelect6||userSelect3==userSelect6||userSelect4==userSelect6||userSelect5==userSelect6) {
				System.out.println("중복된 숫자입니다");
				System.out.println("다시 입력해주세요");
				userSelect6=Integer.parseInt(sc.nextLine());
			}
			else {
				break;
			}
		}
		
		int randomSelect1=0;
		int randomSelect2=0;
		int randomSelect3=0;
		int randomSelect4=0;
		int randomSelect5=0;
		int randomSelect6=0;
		
		System.out.println("당신의 로또번호는");
		System.out.println("["+userSelect1+"]"+"["+userSelect2+"]"+"["+userSelect3+"]"+"["+userSelect4+"]"+"["+userSelect5+"]"+"["+userSelect6+"]");
	
		System.out.println();
		System.out.println("로또를 시작합니다.");
		sc.nextLine();
		System.out.println("첫번째 공을 뽑겟습니다.");
		sc.nextLine();
		randomSelect1=random.nextInt(45);
		System.out.println("첫번째 뽑은 공은 "+lotArr[randomSelect1].num+"입니다");
		lotArr[randomSelect1].count -=1;
		System.out.println("["+lotArr[randomSelect1].num+"]");
		
		
		sc.nextLine();
		System.out.println("두번째 공을 뽑겠습니다");
		sc.nextLine();
		randomSelect2=random.nextInt(45);
		while(randomSelect1==randomSelect2) {
			randomSelect2=random.nextInt(45);
		}
		System.out.println("두번째 뽑은 공은 "+lotArr[randomSelect2].num+"입니다");
		lotArr[randomSelect2].count -=1;
		System.out.println("["+lotArr[randomSelect1].num+"]"+"["+lotArr[randomSelect2].num+"]");
		
		
		sc.nextLine();
		System.out.println("세번째 공을 뽑겠습니다");
		sc.nextLine();
		randomSelect3=random.nextInt(45);
		while(randomSelect1==randomSelect3||randomSelect2==randomSelect3) {
			randomSelect3=random.nextInt(45);
		}
		System.out.println("세번째 뽑은 공은 "+lotArr[randomSelect3].num+"입니다");
		lotArr[randomSelect3].count -=1;
		System.out.println("["+lotArr[randomSelect1].num+"]"+"["+lotArr[randomSelect2].num+"]"+"["+lotArr[randomSelect3].num+"]");
		
		
		sc.nextLine();
		System.out.println("네번째 공을 뽑겠습니다");
		sc.nextLine();
		randomSelect4=random.nextInt(45);
		while(randomSelect1==randomSelect4||randomSelect2==randomSelect4||randomSelect3==randomSelect4) {
			randomSelect4=random.nextInt(45);
		}
		System.out.println("네번째 뽑은 공은 "+lotArr[randomSelect4].num+"입니다");
		lotArr[randomSelect4].count -=1;
		System.out.println("["+lotArr[randomSelect1].num+"]"+"["+lotArr[randomSelect2].num+"]"+"["+lotArr[randomSelect3].num+"]"+"["+lotArr[randomSelect4].num+"]");
		
		
		
		sc.nextLine();
		System.out.println("다섯번째 공을 뽑겠습니다");
		sc.nextLine();
		randomSelect5=random.nextInt(45);
		while(randomSelect1==randomSelect5||randomSelect2==randomSelect5||randomSelect3==randomSelect5||randomSelect4==randomSelect5) {
			randomSelect5=random.nextInt(45);
		}
		System.out.println("다섯번째 뽑은 공은 "+lotArr[randomSelect5].num+"입니다");
		lotArr[randomSelect5].count -=1;
		System.out.println("["+lotArr[randomSelect1].num+"]"+"["+lotArr[randomSelect2].num+"]"+"["+lotArr[randomSelect3].num+"]"+"["+lotArr[randomSelect4].num+"]"+"["+lotArr[randomSelect5].num+"]");
		
		
		
		sc.nextLine();
		System.out.println("여섯번째 공을 뽑겠습니다");
		sc.nextLine();
		randomSelect6=random.nextInt(45);
		while(randomSelect1==randomSelect6||randomSelect2==randomSelect6||randomSelect3==randomSelect6||randomSelect4==randomSelect6||randomSelect5==randomSelect6) {
			randomSelect6=random.nextInt(45);
		}
		System.out.println("여섯번째 뽑은 공은 "+lotArr[randomSelect6].num+"입니다");
		lotArr[randomSelect6].count -=1;
		System.out.println("["+lotArr[randomSelect1].num+"]"+"["+lotArr[randomSelect2].num+"]"+"["+lotArr[randomSelect3].num+"]"+"["+lotArr[randomSelect4].num+"]"+"["+lotArr[randomSelect5].num+"]"+"["+lotArr[randomSelect6].num+"]");
		
		
		int count=0;
		
		if(userSelect1==lotArr[randomSelect1].num||userSelect1==lotArr[randomSelect2].num||userSelect1==lotArr[randomSelect3].num||userSelect1==lotArr[randomSelect4].num||userSelect1==lotArr[randomSelect5].num||userSelect1==lotArr[randomSelect6].num) {
			count +=1;
		}
		if(userSelect2==lotArr[randomSelect1].num||userSelect2==lotArr[randomSelect2].num||userSelect2==lotArr[randomSelect3].num||userSelect2==lotArr[randomSelect4].num||userSelect2==lotArr[randomSelect5].num||userSelect2==lotArr[randomSelect6].num) {
			count +=1;
		}
		if(userSelect3==lotArr[randomSelect1].num||userSelect3==lotArr[randomSelect2].num||userSelect3==lotArr[randomSelect3].num||userSelect3==lotArr[randomSelect4].num||userSelect3==lotArr[randomSelect5].num||userSelect3==lotArr[randomSelect6].num) {
			count+=1;
		}
		if(userSelect4==lotArr[randomSelect1].num||userSelect4==lotArr[randomSelect2].num||userSelect4==lotArr[randomSelect3].num||userSelect4==lotArr[randomSelect4].num||userSelect4==lotArr[randomSelect5].num||userSelect4==lotArr[randomSelect6].num) {
			count+=1;
		}
		if(userSelect5==lotArr[randomSelect1].num||userSelect5==lotArr[randomSelect2].num||userSelect5==lotArr[randomSelect3].num||userSelect5==lotArr[randomSelect4].num||userSelect5==lotArr[randomSelect5].num||userSelect5==lotArr[randomSelect6].num) {
			count+=1;
		}
		if(userSelect6==lotArr[randomSelect1].num||userSelect6==lotArr[randomSelect2].num||userSelect6==lotArr[randomSelect3].num||userSelect6==lotArr[randomSelect4].num||userSelect6==lotArr[randomSelect5].num||userSelect6==lotArr[randomSelect6].num) {
			count+=1;
		}
		System.out.println("맞힌 갯수 : "+count+"개");
			
		}
}











//System.out.println("로또를 시작합니다 맞히면 만원");
//System.out.println("1~10까지 수를 고르세요");
//int userSelect=Integer.parseInt(sc.nextLine());
//System.out.println(userSelect+"를 고르셨습니다");
//sc.nextLine();
//System.out.println("로또를 시작합니다");
//int lotSelect=random.nextInt(10)+1;
//System.out.println("로또에서 나온 숫자는??!?!");
//System.out.println("두구두구두구두구두구두구");
//sc.nextLine();
//System.out.println(lotSelect+"!!!!!");
//if(lotSelect==userSelect) {
//	System.out.println("당첨입니다!! 축하합니다!!");
//}
//else {
//	System.out.println("꽝!");
//}