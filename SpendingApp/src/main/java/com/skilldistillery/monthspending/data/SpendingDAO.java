package com.skilldistillery.monthspending.data;

import java.util.List;

import com.skilldistillery.monthspending.entities.Spending;

public interface SpendingDAO {

	Spending findById(int id);

	Spending addNewSpending(Spending spending);

	boolean deleteSpending(int id);
	
	Spending updateSpending(Spending spending);

	List<Spending> findAllSpendings();

}
