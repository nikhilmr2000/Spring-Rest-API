package com.spring.BrandMobile.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="mobile")
public class Mobile {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="mobilename")
	private String name;
	
	@Column(name="price")
	private long price;
	
	@JoinColumn(name="brand_id")
	@ManyToOne(cascade=CascadeType.ALL)
	@JsonBackReference
	private Brand brand;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(String name, long price) {
		super();
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + "]";
	}
	
	
	
}
