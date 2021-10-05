package com.sip.devops.services;

import java.util.List;

import com.sip.devops.entities.Devops;

public interface DevopsServices {

	Devops addDevops(Devops devops);
	Devops updateDevops(Devops devops);
	void deleteDevops(long id);
	List<Devops>findDevops();
	
}
