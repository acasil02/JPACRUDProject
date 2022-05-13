package com.skilldistillery.monthspending.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="monthly_spending")
public class Spending {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private Double groceries;

	public Spending() {
		super();
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

	@Override
	public String toString() {
		return "Spending [id=" + id + ", groceries=" + groceries + "]";
	}

}
