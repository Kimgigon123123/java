package pack03_constructor;

public class Ex03_CarMain {
	public static void main(String[] args) {
		Ex03_Car myCar= new Ex03_Car("기아차","소나타","검정");
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		myCar.maxSpeed=100;
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
	}

}
