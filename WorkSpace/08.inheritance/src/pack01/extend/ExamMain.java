package pack01.extend;

public class ExamMain {
	public static void main(String[] args) {
		ParentClass pc= new ParentClass();
		System.out.println(pc.parent_field);
		pc.parentMethod();
		
		ChildClass cc= new ChildClass();
		System.out.println(cc.child_field);
		cc.childMethod();
		//상속 후
		System.out.println("Childe : "+ cc.parent_field);
	}
}
