import java.util.Scanner;

public class GetterSetterMain {
	public static void main(String[] args) {
		GetterSetter gs1 = new GetterSetter();
		GetterSetter gs2 = new GetterSetter();
		Scanner sc= new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		
		gs1.setAge(num);
		
	}
}
