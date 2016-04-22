package com.before5.domain;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//스트링 id,pw,phone,gender,name  인트 grade  데이트 birth

//게터와 세터,to string을 한다.
public class MemberVO {
	
	private String id;
	private String pw;
	private String phone;
	private String gender;
	private String name;
	private int grade;
	private Date birth;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(String birth) {					//Date형식으로 바꾸는 작업
		
		DateFormat sdFormat = new SimpleDateFormat("yyMMdd");//포맷을 설정한다.
		Date tempDate=null;
		try {
			tempDate = sdFormat.parse(birth);			//들어온 스트링값을 변환한다.
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(tempDate.toString());
		this.birth=tempDate;						//마지막으로 데이터를 넣어준다.

	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", phone=" + phone + ", gender=" + gender + ", name=" + name
				+ ", grade=" + grade + ", birth=" + birth + "]";
	} 
	
	
}
