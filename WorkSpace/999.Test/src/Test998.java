import java.util.Random;
import java.util.Scanner;

public class Test998 {
	public static void main(String[] args) {
		
		System.out.println("겜 시작, 난이도를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int dif = Integer.parseInt(sc.nextLine());
		String[]arr = new String[dif];
		
		
		for(int a=0; a<arr.length;a++) {
			arr[a]="?";
			System.out.print("["+arr[a]+"]");
			
		}
		int random = new Random().nextInt(dif);
		while(true) {
		System.out.println();
		//System.out.println(random); 주석 풀면 정답 보여줌
		System.out.println("숫자를 입력하세요");
		int uNum = Integer.parseInt(sc.nextLine())-1;
		if(random==uNum) {
			System.out.println("정답");
			arr[random]="O";
			for(int a=0; a<arr.length;a++) {
			System.out.print("["+arr[a]+"]");
			}
			break;
			
			
		}
		else {
			System.out.println("오답");
			arr[uNum]="X";
		
			for(int a=0; a<dif;a++) {
				System.out.print("["+arr[a]+"]");
				
			}
		}
		
		
		
		
		
		
		
		
	}


}
}
