package com.spring.BrandMobile.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.BrandMobile.UserNotFound;
import com.spring.BrandMobile.Entity.Brand;
import com.spring.BrandMobile.Entity.Mobile;
import com.spring.BrandMobile.Service.BrandService;

@RestController
public class BrandController {
	
	@Autowired
	private BrandService service;
	
	@PostMapping("/mobile")
	public ResponseEntity<?> addBrands(@RequestBody Mobile mobile) {
		Mobile mobiles=service.addMobile(mobile);
		if(mobiles==null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/mobile")
	public List<Brand> getAllMobile(){
		return service.getMobile();
	}
	
	@PutMapping("/{brand}/{mobile}/{cost}")
	public Mobile updateMobPrice(@PathVariable String brand,@PathVariable String mobile,@PathVariable long cost) {
		if(service.updatemobile(cost, brand, mobile)==null) {
			throw new UserNotFound();
		}
		return service.updatemobile(cost, brand, mobile);
	}
	
	
}
