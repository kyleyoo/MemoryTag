package com.before5.sample;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DBTest {
	private static final Logger logger = LoggerFactory.getLogger(DBTest.class);

	@Inject
	SqlSessionTemplate session;
	
	@Test
	public void test() {
		logger.info(session.selectOne("com.before5.sample.TimeMapper.getSysdate").toString());
	}

}
