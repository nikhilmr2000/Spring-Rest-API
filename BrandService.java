package com.spring.BrandMobile.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.BrandMobile.Entity.Brand;
import com.spring.BrandMobile.Entity.Mobile;
import com.spring.BrandMobile.Repository.BrandRepo;
import com.spring.BrandMobile.Repository.MobileRepo;

@Service
public class BrandService {
	@Autowired
	BrandRepo repo;
	@Autowired
	MobileRepo mobileRepo;
	public Mobile addMobile(@RequestBody Mobile mobile) {
		return repo.save(mobile);
	}	
	
	public List<Brand> getMobile(){
		return mobileRepo.findBybrand();
	}
	
	public Mobile updatemobile(long cost,String brand,String mobile) {
		List<Mobile> mob=repo.findAll();
		for(Mobile mobiles: mob) {
			if(mobiles.getName().equals(mobile)) {
				if(mobiles.getBrand().getBrand().equals(brand)) {
					mobiles.setPrice(cost);
					return repo.save(mobiles);
				}
				else {
					return null;
				}
			}
		}
		return null;
	}
	
}
