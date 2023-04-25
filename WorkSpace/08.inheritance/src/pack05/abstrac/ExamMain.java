package pack05.abstrac;

public class ExamMain {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		Dog dog = new Dog();
		dog.sound();
		
		Animal animal=new Cat();
		animal.sound();
		animal= new Dog();
		animal.sound();
	}
}
