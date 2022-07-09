package JDBC.demo;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import JDBC.Utils.JDBCUtils;

public class jdbcTransactionDemo11 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		try {
			conn = JDBCUtils.getConnection();
			//开启事务
			conn.setAutoCommit(false);
			//事务
			String sql1 = "update account set balance = balance - ? where id = ?";
			String sql2 = "update account set balance = balance + ? where id = ?";
			pstmt1 = (PreparedStatement) conn.prepareStatement(sql1);
			pstmt2 = (PreparedStatement) conn.prepareStatement(sql2);
			pstmt1.setDouble(1, 500);
			pstmt1.setInt(2, 1);
			pstmt2.setDouble(1, 500);
			pstmt2.setInt(2, 2);
			pstmt1.executeUpdate();
			pstmt2.executeUpdate();
			//提交事务
			conn.commit();
		} catch (Exception e) {
			try {
				if(conn!=null) {
					conn.rollback();
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.close(pstmt1, conn);
			JDBCUtils.close(pstmt2, null);
		}
	}
}
