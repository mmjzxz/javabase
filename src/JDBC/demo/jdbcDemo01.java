package JDBC.demo;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class jdbcDemo01 {
	public static void main(String[] args) throws Exception {
		//1.导入驱动jar包
		//2.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//3.获取数据库连接对象
		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","root");
		//4.定义sql语句
		String sql = "update account set balance = 500 where id = 1";
		//5.获取执行sql的对象 statement
		Statement stmt = (Statement) conn.createStatement();
		//6.执行sql语句
		int count = stmt.executeUpdate(sql);
		//7.处理结果
		System.out.println(count);
		//8.释放资源
		stmt.close();
		conn.close();
	}
}
