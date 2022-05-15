package com.skilldistillery.monthspending.data;

import java.util.ArrayList;
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
	public Spending findById(int id) {
		return em.find(Spending.class, id);
	}

	@Override
	public List<Spending> findAllSpendings() {
		List<Spending> spendings = new ArrayList<>();
		String jpql = "SELECT s FROM Spending s";
		spendings = em.createQuery(jpql, Spending.class).getResultList();
		return spendings;
	}

	@Override
	public Spending addNewSpending(Spending spending) {
		em.persist(spending);
		em.flush();
		return spending;
	}

	@Override
	public boolean deleteSpending(int id) {
		Spending spendingToDelete = em.find(Spending.class, id);
		if (spendingToDelete != null) {
			em.remove(spendingToDelete);
		}
		boolean spendingWasDeleted = !em.contains(spendingToDelete);
		return spendingWasDeleted;
	}

	@Override
	public Spending updateSpending(Spending spending) {
		Spending spendingToUpdate = em.find(Spending.class, spending.getId());
		if (spendingToUpdate != null) {
			spendingToUpdate.setGroceries(spending.getGroceries());
			spendingToUpdate.setBillsUtilities(spending.getBillsUtilities());
			spendingToUpdate.setShopping(spending.getShopping());
			spendingToUpdate.setGas(spending.getGas());
			spendingToUpdate.setCar(spending.getCar());
			spendingToUpdate.setHealthInsurance(spending.getHealthInsurance());
		}

		return spendingToUpdate;
	}

}
