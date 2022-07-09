package JDBC.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import JDBC.Utils.JDBCUtils;

public class PreparedStatementDemo10 {
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
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		if(username == null&&password == null) {
			return false;
		}
		try {
			conn = JDBCUtils.getConnection();
			String sql = "select *from user where username = ? and password = ?";
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			//������ֵ
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.close(rs, pstmt, conn);
		}
		return false;
	}
}
