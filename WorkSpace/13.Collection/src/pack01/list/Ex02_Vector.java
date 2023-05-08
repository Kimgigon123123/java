package pack01.list;

import java.util.List;
import java.util.Vector;

public class Ex02_Vector {
	//사용빈도가 없거나 매우 낮기 때문에 이론만 살펴보고 넘어감
	//List라는 interface를 상속받았기 때문에 기본구조는 ArrayList,LinkedList,Vector 전부 비슷함
	// TestDTO라는 클래스를 묶어서 저장하고 싶다. ?에는 뭘 넣을까
	//1.List 생성해보기
	//2.List에 요소 추가해보기 (TestDTO)
	//3. List에 있는 요소 내용 출력해보기
	public static void main(String[] args) {
		List<TestDTO> list = new Vector<TestDTO>();
		list.add(new TestDTO("김","기곤"));
		list.add(new TestDTO("곽","영균"));
		list.add(new TestDTO());
		TestDTO dto = list.get(0);
		TestDTO dto1= list.get(1);
		list.get(2).setFirstName("김");
		list.get(2).setLastName("건호");
		
		System.out.println(dto.getFirstName()+dto.getLastName());
		System.out.println(dto1.getFirstName()+dto1.getLastName());
		System.out.println(list.get(2).getFirstName()+list.get(2).getLastName());
		

	}
	
	
	
}
