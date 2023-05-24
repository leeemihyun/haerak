package kr.co.haerak.service.club;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.haerak.dao.club.InsertClubDAO;
import kr.co.haerak.domain.club.ClubInsertDomain;
import kr.co.haerak.vo.club.ClubInsertVO;

/**
 * 모임 등록 수정 Service
 * @author user
 */
@Component
public class InsertClubService {
	
	@Autowired(required = false)
	private InsertClubDAO icDAO;
	/**
	 * 모임 등록 method
	 * @param cVO
	 */
	public void insertClubInfo(ClubInsertVO ciVO) {
		int i = Integer.parseInt(ciVO.getZipcode().substring(0, 2));
		int actiAreaNum=1;
		if(i<10)actiAreaNum=1;//서울
		if(i>=10 && i <=20)actiAreaNum=2;//경기
		if(i>=21 && i <=23)actiAreaNum=3;//인천
		if(i>=24 && i <=26)actiAreaNum=4;//강원
		if(i>=27 && i <=29)actiAreaNum=5;//충북
		if(i==30)actiAreaNum=6;//세종
		if(i>=31 && i <=33)actiAreaNum=7;//충남
		if(i>=34 && i <=35)actiAreaNum=8;//대전
		if(i>=36 && i <=40)actiAreaNum=9;//경북
		if(i>=41 && i <=43)actiAreaNum=10;//대구
		if(i>=44 && i <=45)actiAreaNum=11;//울산
		if(i>=46 && i <=49)actiAreaNum=12;//부산
		if(i>=50 && i <=53)actiAreaNum=13;//경남
		if(i>=54 && i <=56)actiAreaNum=14;//전북
		if(i>=57 && i <=60)actiAreaNum=15;//전남
		if(i>=61 && i <=62)actiAreaNum=16;//광주
		if(i==63)actiAreaNum=17;//제주
		
		ciVO.setActiAreaNum(actiAreaNum);
		
		icDAO.insertClubInfo(ciVO);
		
	}//insertClubInfo
	
	
	/**
	 * 모임 수정 method
	 * @param cVO
	 */
	public void updateClubInfo(ClubInsertVO cVO) {
		
	}//updateClubInfo
	
	
	/**
	 * 수정할 정보를 수정할 페이지에 세팅
	 * @param clubNum
	 * @return
	 */
	public ClubInsertDomain setSelectClub(int clubNum) {
		
		ClubInsertDomain result=new ClubInsertDomain();
		
		return result;
	}//setSelectClub
	
	
	
	
	
	
}//InsertClubService
