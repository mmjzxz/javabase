package JDBC.demo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import JDBC.Utils.JDBCUtils;
import JDBC.entity.Emp;

/*
 * 查询emp表数据并封装成对象，然后装载集合，返回
 */
public class jdbcDemo08 {
	public static void main(String[] args) {
		List<Emp> list = new jdbcDemo08().findAll();
		System.out.println(list);
		System.out.println(list.size());
		for (Emp employee : list) {
			System.out.println(employee.toString());
		}
	}
	
	public List<Emp> findAll(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Emp> list = null;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "select *from emp";
			stmt = (Statement) conn.createStatement();
			rs = stmt.executeQuery(sql);
			Emp employee = null;
			list = new ArrayList<Emp>();
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.close(rs,stmt, conn);
		}
		return list;
	}
}
