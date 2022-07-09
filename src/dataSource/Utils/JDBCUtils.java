package dataSource.Utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

/**
 * Druid���ӳع�����
 * @author Administrator
 * @class JDBCUtils
 * @date 2021��2��3������4:49:10
 * @version
 */
public class JDBCUtils {
	//�����Ա����
	private static DataSource ds;
	static {
		try {
			//���������ļ�
			Properties pro = new Properties();
			pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
			//��ȡDataSource
			ds = DruidDataSourceFactory.createDataSource(pro);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * ��ȡ����
	 */
	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}
	
	/*
	 * �ͷ���Դ
	 */
	public static void close(Statement stmt,Connection conn) {
//		if(stmt!=null) {
//			try {
//				stmt.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		if(conn!=null) {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		close(null, stmt, conn);
	}
	
	public static void close(ResultSet rs,Statement stmt,Connection conn) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * ��ȡ���ӳ�
	 */
	public static DataSource getDataSource() {
		return ds;
	}
}
