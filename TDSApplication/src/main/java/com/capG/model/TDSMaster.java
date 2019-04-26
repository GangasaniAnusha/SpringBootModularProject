package com.capG.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tds_master")
//Pojo class which maps with the user details
public class TDSMaster {
	
	@Id
	private int id;
	@NotNull
	private String deductorName;
	@NotNull
	private String deductorPlan;
	@NotNull
	private int tdsDeposited;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTdsDeposited() {
		return tdsDeposited;
	}
	public void setTdsDeposited(int tdsDeposited) {
		this.tdsDeposited = tdsDeposited;
	}
	public String getDeductorName() {
		return deductorName;
	}
	public void setDeductorName(String deductorName) {
		this.deductorName = deductorName;
	}
	public String getDeductorPlan() {
		return deductorPlan;
	}
	public void setDeductorPlan(String deductorPlan) {
		this.deductorPlan = deductorPlan;
	}
	
	
	

}
