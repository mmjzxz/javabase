package JDBC.demo;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class jdbcDemo01 {
	public static void main(String[] args) throws Exception {
		//1.��������jar��
		//2.ע������
		Class.forName("com.mysql.jdbc.Driver");
		//3.��ȡ���ݿ����Ӷ���
		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","root");
		//4.����sql���
		String sql = "update account set balance = 500 where id = 1";
		//5.��ȡִ��sql�Ķ��� statement
		Statement stmt = (Statement) conn.createStatement();
		//6.ִ��sql���
		int count = stmt.executeUpdate(sql);
		//7.������
		System.out.println(count);
		//8.�ͷ���Դ
		stmt.close();
		conn.close();
	}
}
