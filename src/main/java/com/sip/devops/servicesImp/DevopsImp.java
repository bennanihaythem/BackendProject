package com.sip.devops.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sip.devops.dao.DevopsRepository;
import com.sip.devops.entities.Devops;
import com.sip.devops.services.DevopsServices;
@Service
@Transactional
public class DevopsImp implements DevopsServices{

	@Autowired
	private DevopsRepository devopsRepository;
	@Override
	public Devops addDevops(Devops devops) {
		// TODO Auto-generated method stub
		return devopsRepository.save(devops);
	}

	@Override
	public Devops updateDevops(Devops devops) {
		// TODO Auto-generated method stub
		//Devops oldDevops=devopsRepository.getById(id);
		//if(devops.equals(null)) {return devopsRepository.save(oldDevops);}
//		else {
//			return devopsRepository.save(devops);
//		}
		devops.setFirstname(devops.getFirstname());
		devops.setName(devops.getName());
		devops.setEmail(devops.getEmail());
		devops.setTel(devops.getTel());
		return devopsRepository.save(devops);
	}

	@Override
	public void deleteDevops(long id) {
		// TODO Auto-generated method stub
		devopsRepository.deleteById(id);
	}

	@Override
	public List<Devops> findDevops() {
		// TODO Auto-generated method stub
		return devopsRepository.findAll();
	}

}
