package practicecollection;

import java.util.ArrayList;
import java.util.List;

public class DAO {

	
	ArrayList<DTO> getList(){
		ArrayList<DTO> dtoList = new ArrayList<DTO>();
		dtoList.add(new DTO(1, "짜장면", 3000));
		dtoList.add(new DTO(2, "짬뽕", 4000));
		dtoList.add(new DTO(1, "볶음밥", 5000));
		
		return dtoList;

	}
	
	ArrayList<DTO> getList2(){
		ArrayList<DTO> dtoList = new ArrayList<DTO>();
		dtoList.add(new DTO(1, "후라이드", 3000));
		dtoList.add(new DTO(2, "양념", 4000));
		dtoList.add(new DTO(1, "반반", 5000));
		
		return dtoList;

	}
	
	void display(ArrayList<DTO> 리스트아무거나) {
		for(int i = 0;i<리스트아무거나.size();i++) {
			System.out.println(리스트아무거나.get(i).num+"번메뉴");
			System.out.println("이름: "+리스트아무거나.get(i).name);
			System.out.println("가격: "+리스트아무거나.get(i).price);
		}
	}
		void display2(ArrayList<String> 리스트아무거나) {
			for(int i = 0;i<리스트아무거나.size();i++) {
				System.out.println(리스트아무거나.get(i)+"번메뉴");
				System.out.println("이름: "+리스트아무거나.get(i));
				System.out.println("가격: "+리스트아무거나.get(i));
			}
		
	}
}
