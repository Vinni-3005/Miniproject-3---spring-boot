package com.example.VaccinationCenter.bean;

import jakarta.persistence.*;

@Entity
@Table(name="vaccination_center")
public class VaccinationCenterBean {
	@Id
	@GeneratedValue
	private int vaccinationid;
	@Column
	private String vaccinationname;
	@Column
	private String location;
	@Column
	private int capacity;
	public int getVaccinationid() {
		return vaccinationid;
	}
	public void setVaccinationid(int vaccinationid) {
		this.vaccinationid = vaccinationid;
	}
	public String getVaccinationname() {
		return vaccinationname;
	}
	public void setVaccinationname(String vaccinationname) {
		this.vaccinationname = vaccinationname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	

}
