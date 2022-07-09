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
 * Druid连接池工具类
 * @author Administrator
 * @class JDBCUtils
 * @date 2021年2月3日下午4:49:10
 * @version
 */
public class JDBCUtils {
	//定义成员变量
	private static DataSource ds;
	static {
		try {
			//加载配置文件
			Properties pro = new Properties();
			pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
			//获取DataSource
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
	 * 获取连接
	 */
	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}
	
	/*
	 * 释放资源
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
	 * 获取连接池
	 */
	public static DataSource getDataSource() {
		return ds;
	}
}
