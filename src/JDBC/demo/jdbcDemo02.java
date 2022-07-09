package JDBC.demo;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/*
 *  account�����һ����¼ insert���
 */
public class jdbcDemo02 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			//1.ע������
			Class.forName("com.mysql.jdbc.Driver");
			//2.����sql
			String sql = "insert into account values(null,'����',3000)";
			//3.��ȡconnection����
			conn = (Connection) DriverManager.getConnection("jdbc:mysql:///db3","root","root");
			//4.��ȡִ��sql�Ķ���Statement
			stmt = (Statement) conn.createStatement();
			//5.ִ��sql���
			int count = stmt.executeUpdate(sql);
			//6.������
			System.out.println(count);
			if(count>0) {
				System.out.println("��ӳɹ�");
			}else {
				System.out.println("���ʧ��");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//�����ָ���쳣
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
