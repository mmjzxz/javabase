package dataSource.c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author Administrator
 * @class c3p0Demo01
 * @date 2021年2月3日上午1:34:32
 * @version
 */
public class c3p0Demo01 {
	public static void main(String[] args) throws SQLException {
		//1.创建数据库连接池对象
		DataSource ds = new ComboPooledDataSource();
		//2.获取连接对象
		Connection conn = (Connection) ds.getConnection();
		System.out.println(conn);
	}
}
