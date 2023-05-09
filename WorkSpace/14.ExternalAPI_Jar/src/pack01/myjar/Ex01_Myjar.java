package pack01.myjar;

import java.util.ArrayList;
import java.util.List;

import pack01.list.BoardDAO;
import pack01.list.BoardDTO;
import practicejar.Jar;

public class Ex01_Myjar {
	
	public static void main(String[] args) {
		//자바 프로젝트를 계속해서 만들고 있는데 해당하는 프로젝트가 기능을 가지고,
		// 완성이 되어서 외부에서 사용이 되어야 할때 여러가지 확장자로 추출이 될수 있다 (export)
		//Scanner, Random 등은 사실 자바 프로젝트로 이미 만들어놓고 추출되어 기본 Java언어에
		// 포함되어 있는 기능들이다.
		
		BoardDAO dao = new BoardDAO();
		
		
		List<BoardDTO> list = dao.getList();
		dao.getDisplay(list);
		
		
		
		//내가 만들었던 자바 프로젝트중에 재밌었던것을 jar 파일로 만들어서
		//14번째 프로젝트에서  사용가능하게 해보기
		
		Jar j = new Jar();
		j.display();
		
	}
}
