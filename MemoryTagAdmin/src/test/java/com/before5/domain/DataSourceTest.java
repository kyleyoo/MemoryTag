package com.before5.domain;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DataSourceTest {
	private static final Logger logger = LoggerFactory.getLogger(DataSourceTest.class);

	@Inject
	DataSource ds;
	
	
	//정상
	@Test
	public void test() throws SQLException {
		Connection con=ds.getConnection();
		PreparedStatement pstmt=con.prepareStatement("select sysdate from dual");
		ResultSet rs=pstmt.executeQuery();
		rs.next();
		System.out.println(rs.getString(1));
		con.close();
	}

}
