package com.skilldistillery.monthspending.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.monthspending.entities.Spending;

@Service
@Transactional
public class SpendingDAOImpl implements SpendingDAO {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Spending findById(int spendingId) {
		return em.find(Spending.class, spendingId);
	}

	@Override
	public List<Spending> findall() {
		// TODO Auto-generated method stub
		return null;
	}

}
