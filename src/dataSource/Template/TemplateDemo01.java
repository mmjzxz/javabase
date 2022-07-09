package dataSource.Template;

import org.springframework.jdbc.core.JdbcTemplate;

import dataSource.Utils.JDBCUtils;

/**
 * 
 * @author Administrator
 * @class TemplateDemo01
 * @date 2021年2月3日下午7:01:14
 * @version
 */
public class TemplateDemo01 {
	public static void main(String[] args) {
		JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
		String sql = "update account set balance = 5000 where id = ?";
		int count = template.update(sql,3);
		System.out.println(count);
	}
}
