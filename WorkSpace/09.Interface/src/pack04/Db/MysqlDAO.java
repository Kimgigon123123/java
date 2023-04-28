package pack04.Db;

//A: MySql을 이용해서 Database 작업
public class MysqlDAO implements DataAccessObject{

	@Override
	public void select() {
		System.out.println(IP+"에 접근해서 Mysql Select");
		
	}

	@Override
	public void insert() {
		System.out.println(IP+"에 접근해서 Mysql insert");
		
	}

	@Override
	public void update() {
		System.out.println(IP+"에 접근해서 Mysql update");
		
	}

	@Override
	public void delete() {
		System.out.println(IP+"에 접근해서 Mysql delete");
		
	}

}
