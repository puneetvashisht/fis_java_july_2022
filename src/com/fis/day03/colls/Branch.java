package com.fis.day03.colls;

public class Branch {
	
	int code;
	String location;
	String city;
	String IFSC;
	Atm atm;
	public Branch(int code, String location, String city, String iFSC, Atm atm) {
		super();
		this.code = code;
		this.location = location;
		this.city = city;
		IFSC = iFSC;
		this.atm = atm;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	public Atm getAtm() {
		return atm;
	}
	public void setAtm(Atm atm) {
		this.atm = atm;
	}
	@Override
	public String toString() {
		return "Branch [code=" + code + ", location=" + location + ", city=" + city + ", IFSC=" + IFSC + ", atm=" + atm
				+ "]";
	}
	
	
	

}
