package Practice2;


public class practice6 {
public static void main(String[] args) {
	practice6 pc= new practice6("말하는 로봇",1000);
	System.out.println(pc.speak("나는 "+pc.speak(pc.name)+"이다"));
	System.out.println(pc.speak("가격은 "+pc.price+"원!"));
	System.out.println(pc.speak("여기에 아무말이나 적으면 말을 할 수 있지"));
	System.out.println(pc.speak("ㅋㅋㅋ"));
	pc.run(10);
}

 
 	String name;
 	int price;
 	
 	public practice6(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	String speak(String speak) {
 		return speak;
 	}
	
	void run(int go) {
		System.out.println("달리기 모드를 실행 하였습니다");
		System.out.println(go+"만큼 앞으로 갔습니다");
	}
	
 
}
