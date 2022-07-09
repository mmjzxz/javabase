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
			//获取src路径下的文件的方式--->ClassLoader 类加载器
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
	 *	文件的读取，只需要读取一次即可拿到这些值。使用静态代码块
     */
    
	/**
	 * 	获取连接
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
