package com.wh.Demo;
/**
 * 
 * @author wh
 * @date   2020年5月6日
 */
public class Ticket {
	String highSpeedRailNum;//高铁车次
	String passengerSeat;//座位
	String passengerSite;//目的地
	
	public String getHighSpeedRailNum() {
		return highSpeedRailNum;
	}
	public void setHighSpeedRailNum(String highSpeedRailNum) {
		this.highSpeedRailNum = highSpeedRailNum;
	}
	public String getPassengerSeat() {
		return passengerSeat;
	}
	public void setPassengerSeat(String passengerSeat) {
		this.passengerSeat = passengerSeat;
	}
	public String getPassengerSite() {
		return passengerSite;
	}
	public void setPassengerSite(String passengerSite) {
		this.passengerSite = passengerSite;
	}
	
	public Ticket(){
		
	}
	public Ticket(String highSpeedRailNum, String passengerSeat, String passengerSite) {
		this.highSpeedRailNum = highSpeedRailNum;
		this.passengerSeat = passengerSeat;
		this.passengerSite = passengerSite;
	}
	
	

}
