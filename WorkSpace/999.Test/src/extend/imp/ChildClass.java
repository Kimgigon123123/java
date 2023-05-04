package extend.imp;

public class ChildClass extends SuperParent{
	//extends: 모든 멤버의 상속(private 제외) + 클래스의 상속
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		System.out.println(cc.superField);
		cc.superMethod();
		cc.childMethod();
		cc.testMethod();
		cc.testMethod2();
		
		//cc.interField=10;
		System.out.println(cc.interField);
		
	}
	
	public void childMethod() {
		System.out.println(superField);
		superMethod();
	}
	
}
