package cn.jmu.po;

public class Dormitory {
	private String did;
	private String dname;
	private String sno1;
	private String sno2;
	private String sno3;
	private String sno4;
	private int snum;
	private double wp;
	private double ep;
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
	public String getSno1() {
		return sno1;
	}
	public void setSno1(String sno1) {
		this.sno1 = sno1;
	}
	public String getSno2() {
		return sno2;
	}
	public void setSno2(String sno2) {
		this.sno2 = sno2;
	}
	public String getSno3() {
		return sno3;
	}
	public void setSno3(String sno3) {
		this.sno3 = sno3;
	}
	public String getSno4() {
		return sno4;
	}
	public void setSno4(String sno4) {
		this.sno4 = sno4;
	}
	public int getSnum() {
		return snum;
	}
	public void setSnum(int snum) {
		this.snum = snum;
	}
	public double getWp() {
		return wp;
	}
	public void setWp(double wp) {
		this.wp = wp;
	}
	public double getEp() {
		return ep;
	}
	public void setEp(double ep) {
		this.ep = ep;
	}
	@Override
	public String toString() {
		return "Dormitory [did=" + did + ", dname=" + dname + ", sno1=" + sno1 + ", sno2=" + sno2 + ", sno3=" + sno3
				+ ", sno4=" + sno4 + ", snum=" + snum + ", wp=" + wp + ", ep=" + ep + "]";
	}
	
}
