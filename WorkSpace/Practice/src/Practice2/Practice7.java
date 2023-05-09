package Practice2;

import java.util.ArrayList;

public class Practice7 {

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add("가");
		list.add(true);
		list.add(null);
		
		System.out.println(""+list.get(0)+list.get(1)+list.get(2)+list.get(3));
		
	}
	
	
}
