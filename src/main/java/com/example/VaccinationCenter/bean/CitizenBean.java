package com.example.VaccinationCenter.bean;

import jakarta.persistence.*;

@Entity
@Table(name="citizen")
public class CitizenBean {
	@Id
	@GeneratedValue
	private int citizenid;
	@Column
	private String citizenname;
	@Column
	private int citizenage;
	@Column 
	private String vaccinationstatus;
	@Column
	private int vaccinationstatusid;
	public int getCitizenid() {
		return citizenid;
	}
	public void setCitizenid(int citizenid) {
		this.citizenid = citizenid;
	}
	public String getCitizenname() {
		return citizenname;
	}
	public void setCitizenname(String citizenname) {
		this.citizenname = citizenname;
	}
	public int getCitizenage() {
		return citizenage;
	}
	public void setCitizenage(int citizenage) {
		this.citizenage = citizenage;
	}
	public String getVaccinationstatus() {
		return vaccinationstatus;
	}
	public void setVaccinationstatus(String vaccinationstatus) {
		this.vaccinationstatus = vaccinationstatus;
	}
	public int getVaccinationstatusid() {
		return vaccinationstatusid;
	}
	public void setVaccinationstatusid(int vaccinationstatusid) {
		this.vaccinationstatusid = vaccinationstatusid;
	}
	
	
}
