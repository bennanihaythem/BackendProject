package com.sip.devops;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sip.devops.dao.DevopsRepository;
import com.sip.devops.entities.Devops;
import com.sip.devops.services.DevopsServices;

/*
 * 
 */
@SpringBootApplication
public class DevopsRestApplication implements CommandLineRunner{

	@Autowired
	private DevopsServices devopsServices;
	@Autowired
	private DevopsRepository devopsRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DevopsRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Devops devops1=new Devops();
//		devops1.setFirstname("Bennani");
//		devops1.setName("Haythem");
//		devops1.setEmail("bennanihaythemesprit@gmail.com");
//		devops1.setTel("99890832");
//		devopsServices.addDevops(devops1);
		
//	Devops newDevops=devopsRepository.findById((long) 1).get();
//	//System.out.println("New Devops="+newDevops);
//		newDevops.setName("Hello");
//		devopsServices.updateDevops(1, newDevops);
		
		//devopsServices.deleteDevops(1);
		
		
		devopsServices.findDevops().forEach(d->System.out.println(d));
	}

}
