package com.spring.BrandMobile.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.BrandMobile.Entity.Mobile;

@Repository
public interface BrandRepo extends JpaRepository<Mobile,Integer>{
	
}
