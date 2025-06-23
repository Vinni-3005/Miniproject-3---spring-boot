package com.example.VaccinationCenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.VaccinationCenter.bean.CitizenBean;
import com.example.VaccinationCenter.dao.CitizenDao;



@Service
public class CitizenService {
	@Autowired
	private CitizenDao cdao;
	public int addCitizen(CitizenBean cb) {
		if(cb!=null) {
			cdao.save(cb);
			return 1;
		} else {
			return 0;
		}
	}

}
