package pack01.list;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {
	public static void main(String[] args) {
		
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> list = dao.getList();
		dao.getDisplay(list);
//		System.out.println(dao.getList().get(0).num+dao.getList().get(0).title+dao.getList().get(0).contents);
//		dao.getDisplay(dao);
		
		
		
	}
}
