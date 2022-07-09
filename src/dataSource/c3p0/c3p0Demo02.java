package dataSource.c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class c3p0Demo02 {
	public static void main(String[] args) throws SQLException {
		DataSource ds = new ComboPooledDataSource();
		for(int i = 1;i<=11;i++) {
			Connection conn = ds.getConnection();
			System.out.println(i+":"+conn);
			if(i == 5) {
				//¹é»¹
				conn.close();
			}
		}
	}
}
