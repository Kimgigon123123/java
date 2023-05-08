package practicecollection;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		ArrayList<DTO> 중국집메뉴리스트 = dao.getList();
		
		ArrayList<DTO> 치킨집메뉴리스트 = dao.getList2();
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("1번");
		str.add("2번");
		str.add("3번");
		
		dao.display(치킨집메뉴리스트);
		
		dao.display2(str);
		
	}
	
	
	
}
