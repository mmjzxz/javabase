package JDBC.Utils;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class JDBCUtils {
	private static String url;
    private static String user;
    private static String password;
    private static String driver;
	static {
		try {
			Properties properties = new Properties();
			//��ȡsrc·���µ��ļ��ķ�ʽ--->ClassLoader �������
			ClassLoader classLoader = JDBCUtils.class.getClassLoader();
			URL res = classLoader.getResource("jdbc.properties");
			String path = res.getPath();
			//System.out.println(path);
			properties.load(new FileReader(path));
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
			driver = properties.getProperty("driver");
			Class.forName(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	/**
	 *	�ļ��Ķ�ȡ��ֻ��Ҫ��ȡһ�μ����õ���Щֵ��ʹ�þ�̬�����
     */
    
	/**
	 * 	��ȡ����
	 * @return
	 * @throws SQLException 
	 */
	public static Connection getConnection() throws SQLException {
		return (Connection) DriverManager.getConnection(url,user,password);
	}
	
	public static void close(ResultSet rs,Statement stmt,Connection conn) {
		if(rs != null) {
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
		if(conn!= null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Statement stmt,Connection conn) {
		if(stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!= null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
