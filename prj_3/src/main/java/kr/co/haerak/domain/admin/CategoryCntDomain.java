package kr.co.haerak.domain.admin;

/**
 * 카테고리 Domain
 * @author user
 */
public class CategoryCntDomain {

	private int socialCnt, clubCnt, challengeCnt;

	public CategoryCntDomain() {
	
	}

	
	public CategoryCntDomain(int socialCnt, int clubCnt, int challengeCnt) {
		this.socialCnt = socialCnt;
		this.clubCnt = clubCnt;
		this.challengeCnt = challengeCnt;
	}


	public int getSocialCnt() {
		return socialCnt;
	}

	public void setSocialCnt(int socialCnt) {
		this.socialCnt = socialCnt;
	}

	public int getClubCnt() {
		return clubCnt;
	}

	public void setClubCnt(int clubCnt) {
		this.clubCnt = clubCnt;
	}

	public int getChallengeCnt() {
		return challengeCnt;
	}

	public void setChallengeCnt(int challengeCnt) {
		this.challengeCnt = challengeCnt;
	}

	@Override
	public String toString() {
		return "CategoryCntDomain [socialCnt=" + socialCnt + ", clubCnt=" + clubCnt + ", challengeCnt=" + challengeCnt
				+ "]";
	}

	
	
}//class
