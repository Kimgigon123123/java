package pack02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class Ex01_Jdbc {
	public static void main(String[] args) {
		//JDBC: Java Data Base Connectivity(API)
		// Connection : 연결객체 (SqlDevloper에서 접속정보를 넣고 연결을 하는 창)
		// StateMent : 전송객체 (Sql문을 작성하고 실행했을때 실행되는 에디터 창)
		// ResultSet : 결과객체	( select문의 경우 결과가  표모양으로 밑에 나옴 => 표)
//		OracleDriver : 해당 클래스가 필요하다. (오라클에 접속하기 위해서는)
		
		Ex01_Jdbc jdbc = new Ex01_Jdbc();
		jdbc.connTest();
		
	}
	
	//자바 코드를 통해서 데이터베이스 접속이 가능한지 확인하는 메소드
	public void connTest() {//localhost==127.0.0.1 (oracle local)
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";//java에서 oracle 접속할때 앞에 고정된것 jdbc:oracle:thin:@localhost:1521:xe
		String user="hr";
		String password="0000";
		
		//클래스 동적로딩 (클래스를 우리가 인스턴스화 하는게 아니라 자바 static으로 자바에서 사용할수있게 만듬.
		// 오라클 접속할때만 씀. (오라클에서 이렇게 하라고 만듬 API)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//OracleDriver가 없다면 오류가 발생하고 있다면 다음코드 진행
			Connection conn =DriverManager.getConnection(url,user,password);
			PreparedStatement ps = conn.prepareStatement("select 100 data1 from dual");//;생략 , 쿼리를 가지고 초기화
			ResultSet rs =ps.executeQuery();//쿼리실행, 실행 후 결과 rs에 저장
			//rs는 인덱스를 가지고 있지 않음.
			while(rs.next()) {
				System.out.println(rs.getInt("data1"));//getInt는 데이터 결과가 숫자형일때 쓰는 메소드
														//메소드가 int 값과 String값을 받을 수 있게 오버로딩 되어있는데
														// String을 사용함 => 칼럼의 이름으로 데이터를 가져오는게 정확하다.
			}
			if(conn.isClosed()) {
				System.out.println("닫힘");
			}else {
				System.out.println("열림");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
