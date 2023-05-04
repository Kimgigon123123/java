package dao.dto.method;

public class MethodTest {

	int myMoney=1000;
	
	void 설거지시키기() {
		System.out.println("설기지해라");
		System.out.println("(동생이 설거지함)");
	}
	
	int 돈주고청소시키기(int money) {
		System.out.println("돈줄테니깐 청소해라");
		return myMoney-money;
	}
	
	int 밥사주기(int money) {
		System.out.println("밥 사줌");
		myMoney= myMoney - money;
		return myMoney;
	}
	
	int 동생돈뺏기(int money) {
		System.out.println("돈내놔");
		System.out.println("동생이 돈줌");
		return myMoney+money;
	}
	
	void 월급받기(int money) {
		System.out.println("월급 받음");
		myMoney=myMoney+money;
	}
	int 행복해지기(int money) {
		System.out.println("받은 월급X10 만큼 행복함이 오른다");
		int happy = 0;
		happy+=money*10;
		return happy;
	}
	
	
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		mt.설거지시키기();
		
		mt.myMoney=mt.동생돈뺏기(1000);
		System.out.println(mt.myMoney);
		
		mt.myMoney=mt.밥사주기(400);
		System.out.println(mt.myMoney);
		
		mt.myMoney=mt.돈주고청소시키기(500);
		System.out.println(mt.myMoney);
		
		mt.월급받기(2000);
		System.out.println(mt.myMoney);
		
		int myHappy=mt.행복해지기(2000);
		System.out.println("행복함이"+myHappy+"만큼 상승했습니다");
	}
}

