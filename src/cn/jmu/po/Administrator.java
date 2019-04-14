package cn.jmu.po;

public class Administrator {
	private String mno;
	private String adname;
	private String tel;
	private String password;
	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		this.mno = mno;
	}
	public String getAdname() {
		return adname;
	}
	public void setAdname(String adname) {
		this.adname = adname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Administrator [mno=" + mno + ", adname=" + adname + ", tel=" + tel + ", password=" + password + "]";
	}
	
}
