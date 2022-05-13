package com.skilldistillery.monthspending.data;

import java.util.List;

import com.skilldistillery.monthspending.entities.Spending;

public interface SpendingDAO {
	
	Spending findById(int spendingId);
	List<Spending> findall();

}
