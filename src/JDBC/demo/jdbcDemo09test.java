package JDBC.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import JDBC.Utils.JDBCUtils;

public class jdbcDemo09test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û�����");
		String username = sc.nextLine();
		System.out.println("���������룺");
		String password = sc.nextLine();
		boolean flag = login(username,password);
		if(flag) {
			System.out.println("��¼�ɹ���");
		}else {
			System.out.println("��¼ʧ�ܣ��û������������");
		}
	}
	
	public static boolean login(String username,String password) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		if(username == null&&password == null) {
			return false;
		}
		try {
			conn = JDBCUtils.getConnection();
			String sql = "select *from user where username = '" +username +"' and password = '" +password+"'";
			stmt = (Statement) conn.createStatement();
			rs = stmt.executeQuery(sql);
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.close(rs, stmt, conn);
		}
		return false;
	}
}
