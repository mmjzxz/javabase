package dataSource.Template;
/**
 * 
 * @author Administrator
 * @class TemplateDemo02
 * @date 2021年2月3日下午7:11:10
 * @version
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import dataSource.Utils.JDBCUtils;
import dataSource.entity.Emp;

public class TemplateDemo02 {
	private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
	/*
	 * 1.修改1号数据的salary为10000
	 */
	@Test
	public void test1() {
		//定义sql
		String sql = "update emp set salary = 10000 where id = 1001";
		int count = template.update(sql);
		System.out.println(count);
	}
	
	/*
	 * 2.添加一条记录
	 */
	@Test
	public void test2() {
		String sql = "insert into emp(id,ename,dept_id) values(?,?,?)";
		int count = template.update(sql,1015,"郭靖",10);
		System.out.println(count);
	}
	
	/*
	 * 3.删除刚才添加的记录
	 */
	@Test
	public void test3() {
		String sql = "delete from emp where id = ?";
		int count = template.update(sql,1015);
		System.out.println(count);
	}
	/*
	 * 4.查询id为1001的记录，将其封装为map集合
	 * 这个方法查询的结果集长度只能是1
	 */
	@Test
	public void test4() {
		String sql = "select * from emp where id = ?";
		Map<String,Object> map = template.queryForMap(sql,1001);
		System.out.println(map);
	}
	
	/*
	 * 5.查询所有记录，将其封装为list
	 */
	@Test
	public void test5() {
		String sql = "select * from emp";
		List<Map<String,Object>> list = template.queryForList(sql);
		for (Map<String, Object> stringObjectMap : list) {
			System.out.println(stringObjectMap);
		}
	}
	
	/*
	 * 6.查询所有记录，将其封装为Emp对象的list集合
	 */
	@Test
	public void test6() {
		String sql = "select * from emp";
		List<Emp> list = template.query(sql, new RowMapper<Emp>() {

			@Override
			public Emp mapRow(ResultSet rs, int i) throws SQLException {
				int id = rs.getInt("id");
				String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");
                
				Emp emp = new Emp(id, ename, job_id, mgr, joindate, salary, bonus, dept_id);
				return emp;				
			}
			
		});
		for(Emp emp:list) {
			System.out.println(emp);
		}
	}
	
	@Test
	public void test6_2() {
		String sql = "select * from emp";
		List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
		for (Emp emp : list) {
			System.out.println(emp);
		}
	}
	
	/*
	 * 7.查询总记录数
	 */
	@Test
	public void test7() {
		String sql = "select count(id) from emp";
		Long total = template.queryForObject(sql, Long.class);
		System.out.println(total);
	}
}
