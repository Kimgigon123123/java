package pack;

public class temp {
	public static void main(String[] args) {
		String color="black";
		String model="apple";
		int state=0; // 0은 꺼진 상태 1은 켜진상태 -1 전화중상태
		
		
		state=1; // 버튼을 눌러서 핸드폰을 켠다
		
		if(state==0) {
			System.out.println("꺼진상태");
		}
		else if(state==1) {
			System.out.println("켜진상태");
			System.out.println("전화 하시겠습니까?");
			state=4; // 3은 전화안함 4은 전화함
			if(state==4) {
				state=-1;
			}
			else if(state==3){
				state=1;
			}
		}
		
		if(state==-1) {
			System.out.println("전화중상태");
			System.out.println("할말을 입력해주세요");
		}
		
		
		
	}
}
