package cn.jmu.po;

import java.util.Date;

public class Late {
	private int lid;
	private String sno;
	private String sname;
	private String ltime;
	private String lr;
	private String dname;
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getLtime() {
		return ltime;
	}
	public void setLtime(String ltime) {
		this.ltime = ltime;
	}
	public String getLr() {
		return lr;
	}
	public void setLr(String lr) {
		this.lr = lr;
	}
	@Override
	public String toString() {
		return "Late [lid=" + lid + ", sno=" + sno + ", sname=" + sname + ", ltime=" + ltime + ", lr=" + lr + ", dname="
				+ dname + "]";
	}
	
}
