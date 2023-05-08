package pack01.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01_List {
	public static void main(String[] args) {
		//Collection Framework
		//Collection: 자료를 수집해서 가지고 있을 수 있는 기능을 가진 자료 구조(클래스, 배열)
		//FrameWork: 어떤 목적이나 기능을 미리 쉽게 사용하게 만들어 놓은것 (복잡) ex)밥짓기 vs 햇반
		//List<Extends Object> list = new ...<>;
		//List는 Object를 상속받은 객체 타입만 데이터를 수집하게 해놓음. (클래스)
		//List<묶을 데이터 타입 (DTO) > list = new 자료구조타입(...);
		//List<E> 에서 E는 요소 (Element): 어떤 내용이 내부에 묶여서 저장될지
		List<String> list = new ArrayList<String>(); //ArrayList는 Ex03~04 사용예정
		list.add("Java1");//List가 String 타입을 묶어놓기로 약속이 되어있기 때문에 String만 요소로 넣을 수 있음.
		list.add("Java2");
		list.add("Java3");
		list.add("Java4");
		list.add("Java5");
		list.add(3, "끼워넣기"); //결과 예측 : 용어 : 메소드가 파라메터나 타입다르고 똑같은 이름 가진것
								// 잘 사용 안함 (DB에서 정렬해온 정보가 정합성을 가지고 있기 때문)
		System.out.println(list.size());//배열은 arr.length라는 변수로 크기를 받아올 수 있음.
		System.out.println(list.get(0));//list도 배열과 마찬가지로 0부터 시작해서 크기 -1까지의 index를 가짐
		System.out.println(list.get(1));//list도 배열과 마찬가지로 0부터 시작해서 크기 -1까지의 index를 가짐
		System.out.println(list.get(2));//list도 배열과 마찬가지로 0부터 시작해서 크기 -1까지의 index를 가짐
		
		//list의 내용을 for문을 이용해서 전부 출력해보기. (ex 1차원 배열 내용 출력 : ? )
		
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
