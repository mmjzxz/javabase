package dataSource.c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author Administrator
 * @class c3p0Demo01
 * @date 2021��2��3������1:34:32
 * @version
 */
public class c3p0Demo01 {
	public static void main(String[] args) throws SQLException {
		//1.�������ݿ����ӳض���
		DataSource ds = new ComboPooledDataSource();
		//2.��ȡ���Ӷ���
		Connection conn = (Connection) ds.getConnection();
		System.out.println(conn);
	}
}
