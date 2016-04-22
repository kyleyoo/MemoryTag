package com.before5.persistence;

import java.util.List;

import com.before5.domain.MemberVO;

public interface MemberDAO {

	public void insertMember(MemberVO vo); //insertMember설정
	public MemberVO readMember(String id);  //selectMember 설정(한개 조회)
	public List<MemberVO> selectAll();  // selectAll 설정(전체조회)
	public void updateMember(MemberVO vo);  //update 설정(수정)
	public void deleteMember(String id); //delete 설정(삭제)
}
