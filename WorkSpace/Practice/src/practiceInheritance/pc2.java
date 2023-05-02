package practiceInheritance;

public class pc2 extends pc1 {

	int channel;

	@Override
	void powerOn(){
		System.out.println("소리가 나면서 전원이 켜진다");
	}
	
	public pc2(String model, String color,int channel) {
		super();
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	
	
}
