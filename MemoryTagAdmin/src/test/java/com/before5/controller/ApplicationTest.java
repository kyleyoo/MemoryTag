package com.before5.controller;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class ApplicationTest {
	private static final Logger logger = LoggerFactory.getLogger(ApplicationTest.class);
	
	@Inject
	ApplicationContext ctx;
	
	
	@Test
	public void test() {
		logger.info(ctx.toString());
	}

}
