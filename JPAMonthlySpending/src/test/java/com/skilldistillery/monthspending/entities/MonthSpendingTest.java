package com.skilldistillery.monthspending.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Table;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Entity
@Table(name = "monthly_spending")
class MonthSpendingTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Spending spending;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAMonthlySpending");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();

	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		spending = em.find(Spending.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		spending = null;
	}

	@Test
	@DisplayName("testing monthly spending mapping")
	void test() {
		assertNotNull(spending);
		assertEquals(300, spending.getGroceries());
		assertEquals(800, spending.getBillsUtilities());
		assertEquals(500, spending.getShopping());
		assertEquals(300, spending.getGas());
		assertEquals(100, spending.getCar());
		assertEquals(300, spending.getHealthInsurance());
	}

}
