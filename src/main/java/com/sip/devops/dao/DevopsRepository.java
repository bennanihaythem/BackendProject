package com.sip.devops.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.sip.devops.entities.Devops;

@RepositoryRestController
public interface DevopsRepository extends JpaRepository<Devops, Long>{

//	@Query("Select d From Devops d Where d.devops.id_devops=:id")
//	public Devops getName(@Param long id);
}
