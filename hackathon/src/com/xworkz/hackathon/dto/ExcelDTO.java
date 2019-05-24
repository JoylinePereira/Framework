package com.xworkz.hackathon.dto;

import java.io.Serializable;

public class ExcelDTO implements Serializable{
	
	private int partyId;
	private String partyName;
	private int won;
	private int lost;
	private String State;
	
	public ExcelDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getPartyId() {
		return partyId;
	}

	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}

	public int getLost() {
		return lost;
	}

	public void setLost(int lost) {
		this.lost = lost;
	}

	
	@Override
	public String toString() {
		return "ExcelDTO [partyId=" + partyId + ", partyName=" + partyName + ", won=" + won + ", lost=" + lost
				+ ", State=" + State + "]";
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}
	
	

}
