package com.jfsd.sdp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jfsd.sdp.model.FoodItem;
@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Integer>{
	@Query("from FoodItem f where f.category=?1")
	public List<FoodItem> viewAllFoodItemByCategory(String category);

	
}
