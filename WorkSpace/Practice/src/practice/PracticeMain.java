package practice;

import javax.swing.text.html.parser.DTD;

public class PracticeMain {
	public static void main(String[] args) {
		PracticeDTO dto = new PracticeDTO("김씨",100,50);
		
		PracticeDAO dao = new PracticeDAO();
		dao.display(dto);
		PracticeDTO park = new PracticeDTO("박씨",80,20);
		
		dao.display(park);
	}
	

	
}
