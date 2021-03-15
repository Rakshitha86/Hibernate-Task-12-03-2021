package com.xworkz.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cameradb")
public class CameraDTO implements Serializable{

	@Id
	@Column(name = "camera_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "camera_brand")
	private String brand;
	
	@Column(name = "camera_color")
	private String color;
	
	@Column(name = "camera_price")
	private int price;
	
	@Column(name = "camera_lense")
	private int lense;

	public CameraDTO() {
		System.out.println("Invoked default constructor");
	}

	public CameraDTO(String brand, String color, int price, int lens) {

		this.brand = brand;
		this.color = color;
		this.price = price;
		this.lense = lens;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getLense() {
		return lense;
	}

	public void setLense(int lense) {
		this.lense = lense;
	}

	@Override
	public String toString() {
		return "CameraDTO [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + ", lense=" + lense
				+ "]";
	}

}
