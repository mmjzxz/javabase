package JDBC.demo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import JDBC.entity.Emp;

/*
 * 查询emp表数据并封装成对象，然后装载集合，返回
 */
public class jdbcDemo07 {
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	public static void main(String[] args) {
		List<Emp> list = new jdbcDemo07().findAll();
		System.out.println(list);
		System.out.println(list.size());
		for (Emp employee : list) {
			System.out.println(employee.toString());
		}
	}
	
	public static List<Emp> findAll(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection("jdbc:mysql:///db3","root","root");
			String sql = "select *from emp";
			stmt = (Statement) conn.createStatement();
			rs = stmt.executeQuery(sql);
			Emp employee = null;
			List<Emp> list = new ArrayList<Emp>();
			while(rs.next()) {
				int id = rs.getInt("id");
				String ename = rs.getString("ename");
				int job_id = rs.getInt("job_id");
				int mgr = rs.getInt("mgr");
				Date joindate = rs.getDate("joindate");
				double salary = rs.getDouble("salary");
				double bonus = rs.getDouble("bonus");
				int dept_id = rs.getInt("dept_id");
				employee = new Emp();
//				employee.setId(id);
//				employee.setEname(ename);
//				employee.setJob_id(job_id);
//				employee.setMgr(mgr);
//				employee.setJoindate(joindate);
//				employee.setSalary(salary);
//				employee.setBonus(bonus);
//				employee.setDept_id(dept_id);
				employee = new Emp(id, ename, job_id, mgr, joindate, salary, bonus, dept_id);
				list.add(employee);
			}
			return list;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
