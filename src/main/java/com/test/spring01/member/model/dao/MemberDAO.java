package com.test.spring01.member.model.dao;

import java.util.List;

import com.test.spring01.member.model.dto.MemberDTO;

public interface MemberDAO {
	public List<MemberDTO> getListAll();
	public MemberDTO getSelectOne(MemberDTO dto);
	public void insertMember(MemberDTO dto);
	public void updateMember(MemberDTO dto);
	public void deleteMember(MemberDTO dto);
}