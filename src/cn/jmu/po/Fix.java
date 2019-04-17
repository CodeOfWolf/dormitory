package cn.jmu.po;

import java.util.Date;

public class Fix {
	private int rid;
	private String did;
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
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
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
		return "Fix [rid=" + rid + ", did=" + did + ", dname=" + dname + ", rr=" + rr + ", rtime=" + rtime + ", rs="
				+ rs + "]";
	}

	
}
