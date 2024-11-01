package com.jfsd.sdp.service;

import java.util.List;

import com.jfsd.sdp.model.FoodItem;

public interface FoodItemService {
	
	public String AddFoodItem(FoodItem fooditem);
	   public List<FoodItem> ViewAllFoodItems();
	   public void DeleteFoodItemByID(int fooditemid);
	   List<FoodItem> viewAllFoodItemByCategory(String category);
	   public FoodItem ViewFoodItemByID(int fooditemid);

}
