package cn.jmu.po;

import java.util.Date;

public class Fix {
	private int rid;
	private String roomnum;
	private String dname;
	private String rr;
	private Date rtime;
	private String rs;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRoomnum() {
		return roomnum;
	}
	public void setRoomnum(String roomnum) {
		this.roomnum = roomnum;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getRr() {
		return rr;
	}
	public void setRr(String rr) {
		this.rr = rr;
	}
	public Date getRtime() {
		return rtime;
	}
	public void setRtime(Date rtime) {
		this.rtime = rtime;
	}
	public String getRs() {
		return rs;
	}
	public void setRs(String rs) {
		this.rs = rs;
	}
	@Override
	public String toString() {
		return "Fix [rid=" + rid + ", roomnum=" + roomnum + ", dname=" + dname + ", rr=" + rr + ", rtime=" + rtime
				+ ", rs=" + rs + "]";
	}
	
}
