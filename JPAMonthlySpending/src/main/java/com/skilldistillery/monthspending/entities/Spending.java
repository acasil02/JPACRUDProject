package com.skilldistillery.monthspending.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "monthly_spending")
public class Spending {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private Double groceries;

	@Column(name = "bills_utilities")
	private Double billsUtilities;

	private Double shopping;

	private Double gas;

	private Double car;

	@Column(name = "health_insurance")
	private Double healthInsurance;

	public Spending() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getGroceries() {
		return groceries;
	}

	public void setGroceries(Double groceries) {
		this.groceries = groceries;
	}

	public Double getBillsUtilities() {
		return billsUtilities;
	}

	public void setBillsUtilities(Double billsUtilities) {
		this.billsUtilities = billsUtilities;
	}

	public Double getShopping() {
		return shopping;
	}

	public void setShopping(Double shopping) {
		this.shopping = shopping;
	}

	public Double getGas() {
		return gas;
	}

	public void setGas(Double gas) {
		this.gas = gas;
	}

	public Double getCar() {
		return car;
	}

	public void setCar(Double car) {
		this.car = car;
	}

	public Double getHealthInsurance() {
		return healthInsurance;
	}

	public void setHealthInsurance(Double healthInsurance) {
		this.healthInsurance = healthInsurance;
	}

	@Override
	public String toString() {
		return "Spending: " + id + ", Groceries: " + groceries + ", Bills-Utilities: " + billsUtilities + ", Shopping: "
				+ shopping + ", Gas: " + gas + ", Car: " + car + ", Health Insurance: " + healthInsurance;
	}

}
