package pack07.last.jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDAO {
	
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	
	public void dbClose() {
		try {
			if(rs!=null) {rs.close();}
			if(ps!=null) {ps.close();}
			if(conn!=null) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConn() {
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hanul", "0000");
			if(!conn.isClosed()) {
				System.out.println("다음에 접속됨"+conn.getMetaData().getDatabaseProductVersion());
				return conn;
			}
		} catch (ClassNotFoundException e) {
			System.out.println(" 오라클 드라이버가 준비가 안되어서 사용이 불가능한 PC입니다.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(" 알수없는 오류발생! 개발자에게 문의하세요 ");
		}
		
		return conn;
		
	}

	public void selectList() {
		try {
			conn = getConn();//DB연결객체 초기화 시키기
			ps = conn.prepareStatement("select * from board"); 
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("BOARD_NO"));
			}
		} catch (SQLException e) {
			System.out.println("kggSqlplus Exception : "+e.getMessage());
		}finally {
			// conn,ps,rs 세가지 객체 전부 null로 비워줘야함.(DB Close)
		dbClose();	
			
		}
	}
	
	public void insertBoard() {
		try {
			conn = getConn();//DB연결객체 초기화 시키기
			ps = conn.prepareStatement("INSERT INTO BOARD (BOARD_NO, BOARD_TITLE, BOARD_CONTENT, WRITER, WRITE_DATE) "
					+ "VALUES (11, ?, ?, ?, ?)"); 
//			rs = ps.executeQuery();
			ps.setString(1, "javatitle");
			ps.setString(2, "javacontent");
			ps.setString(3, "writer");
			ps.setString(4, "writedate");
			int result = ps.executeUpdate();
			System.out.println(result);
			
		} catch (SQLException e) {
			System.out.println("kggSqlplus Exception : "+e.getMessage());
		}finally {
			// conn,ps,rs 세가지 객체 전부 null로 비워줘야함.(DB Close)
		dbClose();	
			
		}
	}

	public void selectList(String keyword) {
		try {
			conn = getConn();//DB연결객체 초기화 시키기
//			ps = conn.prepareStatement("select * from board where board_title='"+keyword+"'"); 
			// ↑ 파라메터를 String 형태에 연결시켜서 사용하려니 가독성이 떨어짐.
			ps = conn.prepareStatement("select * from board where board_title=?");
			ps.setString(1, keyword); // ?로 되어있는 파라메터부에 데이터를 넣는것. (왼쪽기준으로 쭉 보면서 ? 의 순서를 보면 된다)
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("BOARD_NO"));
			}
		} catch (SQLException e) {
			System.out.println("kggSqlplus Exception : "+e.getMessage());
		}finally {
			// conn,ps,rs 세가지 객체 전부 null로 비워줘야함.(DB Close)
		dbClose();	
			
		}
		
	}
	
}
