package com.spring.BrandMobile.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.BrandMobile.Entity.Brand;

@Repository
public interface MobileRepo extends JpaRepository<Brand,Integer>{
	@Query(value="select * from brand order by brandname asc",nativeQuery=true)
	List<Brand> findBybrand();
}
