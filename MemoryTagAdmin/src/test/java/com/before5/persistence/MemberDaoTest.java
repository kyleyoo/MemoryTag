package com.before5.persistence;



import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.before5.domain.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDaoTest {		//테스트위에 어노테이션들

	
	@Inject
	private MemberDAO dao;  		//인젝트함
	
	@Test
	public void insertTest()throws Exception{	//insertTest 

		MemberVO vo = new MemberVO();			//vo를 임시적으로 만들어서 데이터를 억지로 집어넣는다.
		vo.setId("gogo13");
		vo.setPw("1234");
		vo.setPhone("010101");
		vo.setName("사람");
		vo.setGender("M");
		vo.setGrade(2);
		vo.setBirth("930625");
		System.out.println(vo);
		dao.insertMember(vo);			//데이터로 만든 vo를 DB에 보낸다.
	
	}

	//public void readTest(String id) throws Exception{ God jisun & young
	@Test
	public void readTest() throws Exception{
		MemberVO vo = dao.readMember("kjs");
		System.out.println(vo);
	}
	
	@Test
	public void readAllTest() throws Exception{
		List<MemberVO> list = dao.selectAll();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	@Test
	public void updateTest() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setId("gogo");
		vo.setPw("123");
		vo.setName("young");
		vo.setPhone("1234567");
		vo.setGender("m");
		vo.setGrade(3);
		dao.updateMember(vo);
	}
	
	@Test
	public void deleteTest() throws Exception{
		
		dao.deleteMember("gogo12");
	}
	

}
