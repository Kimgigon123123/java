package pack01.list;

import java.util.ArrayList;

public class Ex04_ArrayList {
	public static void main(String[] args) {
		
		//사용빈도가 높음. 배열의 단점을 보완하고 불필요한 체이닝, 멀티 쓰레딩 등의 기능이 없기 때문에 제일 많이 사용됨
		//List<E> list = new ArrayList<E>();
		//ArrayList<E> list = new ArrayList<E>();
		
		//String 타입을 묶어서 저장 가능한 Collection 자료구조 ArrayList를 생성하고 데이터 2건을 추가해보기
		
		ArrayList<String> listString = new ArrayList<String>();
		
		listString.add("a");
		listString.add("b");
		System.out.println(listString.get(0)+listString.get(1));
		
		
		//숫자형 데이터 타입을 묶어서 저장 가능한 ... 2건 추가해보기
		
		ArrayList<Integer> listInt = new ArrayList<Integer>();
		
		listInt.add(1);
		listInt.add(2);
		System.out.println(listInt.get(0)+""+listInt.get(1));
		
		
		
		
		// 부울형 데이터 타입을 묶어서 저장 가능한 ... 2건 추가해보기
		
		ArrayList<Boolean> listBoolean = new ArrayList<Boolean>();
		
		listBoolean.add(false);
		listBoolean.add(true);
		System.out.println(listBoolean.get(0)+""+listBoolean.get(1));
		
		//향상된 for문
		//for문과 구조가 다름 : Collection이나 배열등의 자료구조 내부에 Element 를 한건씩 빼주어서, 가독성을 높인 구조.
		//for (요소 : 자료구조){알아서 자료구조의 크기만큼 반복을 하며 :기준 왼쪽요소에 아이템을 하나씩 빼면서 반복함.
		
		//}
		for(String str :listString) {
			System.out.println(str);
		}
		
		int[] Arr = {1,2,3,4,5};
		for( int i : Arr) {
			System.out.println(i);
		}
		
	}
}
