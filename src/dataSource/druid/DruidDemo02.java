package dataSource.druid;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;

import dataSource.Utils.JDBCUtils;

/**
 * 
 * @author Administrator
 * @class DruidDemo02
 * @date 2021年2月3日下午4:47:33
 * @version
 */
public class DruidDemo02 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//1.获取连接
			conn = JDBCUtils.getConnection();
			String sql = "insert into account values(null,?,?)";
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1, "王五");
			pstmt.setDouble(2, 3000);
			int count = pstmt.executeUpdate();
			System.out.println(count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.close(pstmt, conn);
		}
		
	}
}
