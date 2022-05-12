package com.spring.BrandMobile.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="brand")
public class Brand {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="brandname")
	private String brandname;
	@JsonManagedReference
	@JoinColumn(name="brand_id")
	@OneToMany(cascade=CascadeType.ALL)
	private List<Mobile> mobiles;

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brand(String brandname) {
		super();
		this.brandname = brandname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brandname;
	}

	public void setBrand(String brandname) {
		this.brandname = brandname;
	}

	public List<Mobile> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}

	@Override
	public String toString() {
		return "Brand [id=" + id + ", brand=" + brandname + ", mobiles=" + mobiles + "]";
	}
	
	
	

}
