package test01_oop1;

public class DrinkDTO {
//음료의 속성 : 음료 이름, 가격, 수량
	//변수에 바로 접근을 제한을 뒀음
	//퍼블릭으로 어디서든 접근 가능한 메소드를  통해서 변수에 접근하게 만들어야함 ==> getter & setter
	private String name;
	private int price, cnt;
	
	
	
	
	
	
	
	public DrinkDTO(String name, int price, int cnt) {
		super();
		this.name = name;
		this.price = price;
		this.cnt = cnt;
		
		
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
