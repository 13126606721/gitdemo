package com.baizhi.entity;

public class Guru {
	private Integer guruId;
	private String guruName;
	private String guruProfile;
	private String guruBrief;
	private Integer guruStatus;
	public Integer getGuruId() {
		return guruId;
	}
	public void setGuruId(Integer guruId) {
		this.guruId = guruId;
	}
	public String getGuruName() {
		return guruName;
	}
	public void setGuruName(String guruName) {
		this.guruName = guruName;
	}
	public String getGuruProfile() {
		return guruProfile;
	}
	public void setGuruProfile(String guruProfile) {
		this.guruProfile = guruProfile;
	}
	public String getGuruBrief() {
		return guruBrief;
	}
	public void setGuruBrief(String guruBrief) {
		this.guruBrief = guruBrief;
	}
	public Integer getGuruStatus() {
		return guruStatus;
	}
	public void setGuruStatus(Integer guruStatus) {
		this.guruStatus = guruStatus;
	}
	@Override
	public String toString() {
		return "Guru [guruId=" + guruId + ", guruName=" + guruName
				+ ", guruProfile=" + guruProfile + ", guruBrief=" + guruBrief
				+ ", guruStatus=" + guruStatus + "]";
	}
	public Guru(Integer guruId, String guruName, String guruProfile,
			String guruBrief, Integer guruStatus) {
		super();
		this.guruId = guruId;
		this.guruName = guruName;
		this.guruProfile = guruProfile;
		this.guruBrief = guruBrief;
		this.guruStatus = guruStatus;
	}
	public Guru() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
