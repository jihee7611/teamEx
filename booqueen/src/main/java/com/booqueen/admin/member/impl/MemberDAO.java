package com.booqueen.admin.member.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.booqueen.admin.member.UserAgeGroupVO;
import com.booqueen.admin.member.UserVO;

@Repository("MemberDAO")
public class MemberDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	public com.booqueen.admin.member.MemberVO getAdminMember(com.booqueen.admin.member.MemberVO vo) {
		return sqlSessionTemplate.selectOne("MemberDAO.getAdminMember", vo);
	}
	
	public List<com.booqueen.user.member.MemberVO> getUserMember() {
		 List<com.booqueen.user.member.MemberVO> userList = sqlSessionTemplate.selectList("MemberDAO.selectUser");
		 return userList;
	}
	
	public List<UserAgeGroupVO> selectUserAgeGroupList() {
		return sqlSessionTemplate.selectList("UserAgeGroupDAO.selectUserAgeGroupList");
	}
	
	public List<UserVO> getUserGender() {
		return sqlSessionTemplate.selectList("UserDAO.getUserGender");
	}
	
	
}
