package Lab14;
import java.sql.*;
public class Lab14_2 {
	static Connection con;
	static PreparedStatement sql;
	static ResultSet res;
	public Connection getConnection(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/stu_info?useSSL=false&serverTimezone=UTC","root","123456");
			System.out.println("数据库连接成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		Lab14_2 c = new Lab14_2();
		con = c.getConnection();
		try {
			sql = con.prepareStatement("select*from stu_info");
			res = sql.executeQuery();
			System.out.println();
			System.out.println("执行增加、修改、删除前数据：");
			while (res.next()) {
				String id=res.getString("stu_ID");
				String name=res.getString("stu_Name");
				String sex=res.getString("stu_Sex");
				System.out.println("编号："+id);
				System.out.println("姓名："+name);
				System.out.println("性别："+sex);
			}
			
			sql=con.prepareStatement("insert into stu_info"+" values(?,?,?)");
			sql.setObject(1,"20182005888");
			sql.setObject(2, "陈宗龙");
			sql.setObject(3, "male");
			sql.executeUpdate();
			sql=con.prepareStatement("insert into stu_info"+" values(?,?,?)");
			sql.setObject(1,"20182005666");
			sql.setObject(2, "赖龙龙");
			sql.setObject(3, "male");
			sql.executeUpdate();
			sql = con.prepareStatement("select*from stu_info");
			res = sql.executeQuery();
			System.out.println();
			System.out.println("执行增加后的数据：");
			while (res.next()) {
				String id=res.getString("stu_ID");
				String name=res.getString("stu_Name");
				String sex=res.getString("stu_Sex");
				System.out.println("编号："+id);
				System.out.println("姓名："+name);
				System.out.println("性别："+sex);
			}
			
			sql=con.prepareStatement("update stu_info set stu_sex=? where stu_ID=20182005666");
			sql.setObject(1, "female");
			sql.executeUpdate();
			sql.executeUpdate("delete from stu_info where stu_id=20182005888");
			sql.executeUpdate();
			sql.executeUpdate("delete from stu_info where stu_id=20182005666");
			sql.executeUpdate();
			sql = con.prepareStatement("select*from stu_info");
			res = sql.executeQuery();
			System.out.println();
			System.out.println("执行修改、删除后的数据：");
			while (res.next()) {
				String id=res.getString("stu_ID");
				String name=res.getString("stu_Name");
				String sex=res.getString("stu_Sex");
				System.out.println("编号："+id);
				System.out.println("姓名："+name);
				System.out.println("性别："+sex);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
