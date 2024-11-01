package com.jfsd.sdp.model;

import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "food_item")
public class FoodItem {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id;
	  @Column(nullable = false,length = 100)
	  private String category;
	  @Column(nullable = false,length = 100)
	  private String name;
	  @Column(nullable = false,length = 1000)
	  private String description;
	  @Column(nullable = false)
	  private double cost;
	  private Blob fooditemimage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Blob getFooditemimage() {
		return fooditemimage;
	}
	public void setFooditemimage(Blob fooditemimage) {
		this.fooditemimage = fooditemimage;
	}
	

}
