package JDBC.demo;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/*
 *  account表添加一条记录 insert语句
 */
public class jdbcDemo02 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.定义sql
			String sql = "insert into account values(null,'王五',3000)";
			//3.获取connection对象
			conn = (Connection) DriverManager.getConnection("jdbc:mysql:///db3","root","root");
			//4.获取执行sql的对象Statement
			stmt = (Statement) conn.createStatement();
			//5.执行sql语句
			int count = stmt.executeUpdate(sql);
			//6.处理结果
			System.out.println(count);
			if(count>0) {
				System.out.println("添加成功");
			}else {
				System.out.println("添加失败");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//避免空指针异常
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
