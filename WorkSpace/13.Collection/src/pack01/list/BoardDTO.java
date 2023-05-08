package pack01.list;

public class BoardDTO { //데이터베이스의 한행
	private int boardNum;
	private String boardTitle;
	private String boardContent;
	
	
	
	public BoardDTO(int boardNum, String boardTitle, String boardContent) {
		super();
		this.boardNum = boardNum;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
	}
	
	
	
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	
	
	
	

//	int num;
//	String title;
//	String contents;
//	
//	
//	public BoardDTO(int num, String title, String contents) {
//		super();
//		this.num = num;
//		this.title = title;
//		this.contents = contents;
//	}
	
	
	
	
}
