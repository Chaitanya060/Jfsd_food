package com.jfsd.sdp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfsd.sdp.model.FoodItem;
import com.jfsd.sdp.repository.FoodItemRepository;
@Service
public class FoodItemServiceImpl implements FoodItemService{
	
	@Autowired
	private FoodItemRepository foodItemRepository;

	@Override
	public String AddFoodItem(FoodItem fooditem) {
		foodItemRepository.save(fooditem);
		return "FoodItem Added Successfully";
	}

	@Override
	public List<FoodItem> ViewAllFoodItems() {
		return (List<FoodItem>) foodItemRepository.findAll();
	}

	@Override
	public void DeleteFoodItemByID(int fooditemid) {
		foodItemRepository.deleteById(fooditemid);
		
	}

	@Override
	public List<FoodItem> viewAllFoodItemByCategory(String category) {
		return foodItemRepository.viewAllFoodItemByCategory(category);
		
	}

	@Override
	public FoodItem ViewFoodItemByID(int fooditemid) {
		return foodItemRepository.findById(fooditemid).get();
	}
	

}
