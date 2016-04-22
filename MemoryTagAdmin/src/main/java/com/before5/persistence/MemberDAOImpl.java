package com.before5.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.before5.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject					//sqlsession사용 하기 위해서 인젝트한다.
	private SqlSession sqlSession;
	
	private static final String namespace = "com.before5.mapper.MemberMapper";	//Mapper값을 부른다.
	
	@Override
	public void insertMember(MemberVO vo) {	//".insertMember"안에 있는 Mapper네임을 사용여 vo를 보낸다.

		sqlSession.insert(namespace+".insertMember",vo);			
	}

	@Override
	public MemberVO readMember(String id){  //readMember 조회 
		System.out.println(id);
		return sqlSession.selectOne(namespace+".selectMember", id); //".selectMember"안에 있는 Mapper 네임을 사용하여 vo를 보낸다.
	}

	@Override
	public List<MemberVO> selectAll() {
		
		return sqlSession.selectList(namespace+".selectAll");
	}

	@Override
	public void updateMember(MemberVO vo) {
		
		sqlSession.update(namespace+".update",vo);	
	}

	@Override
	public void deleteMember(String id) {
		
		sqlSession.delete(namespace+".delete", id);
		
	}

}
