package dataSource.druid;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
/**
 * 
 * @author Administrator
 * @class DruidDemo01
 * @date 2021年2月3日下午4:47:49
 * @version
 */
public class DruidDemo01 {
	public static void main(String[] args) throws Exception {
		Properties pro = new Properties();
		InputStream is = DruidDemo01.class.getClassLoader().getResourceAsStream("druid.properties");
		pro.load(is);
		DataSource ds = DruidDataSourceFactory.createDataSource(pro);
		Connection conn = ds.getConnection();
		System.out.println(conn);
	}
}
