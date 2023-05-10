package practiceAPI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class Main {
	
	public static void main(String[] args) {
		
		
		Connection conn = null; // 연결객체
		PreparedStatement ps = null; // 전송 실행 객체
		ResultSet rs = null; // 결과 객체
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "hr";
		String pw = "0000";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("로딩완료");
			try {
				conn = DriverManager.getConnection(url,user,pw);
				System.out.println("접속완료");
			} catch (SQLException e) {
				System.out.println("로그인 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("파일이 없습니다");
			e.printStackTrace();
		}
		
		String sql = "SELECT employee_id,first_name,salary FROM employees";
		
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			ArrayList<DTO> list = new ArrayList<>();
			while(rs.next()) {
				DTO dto = new DTO(rs.getInt("employee_id"),rs.getString("first_name"),rs.getInt("salary"));
				list.add(dto);
				System.out.println(dto.employee_id + " " + dto.first_name + " " + dto.salary);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
