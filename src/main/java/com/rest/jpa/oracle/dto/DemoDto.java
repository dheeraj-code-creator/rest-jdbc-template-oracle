package com.rest.jpa.oracle.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DemoDto {
	
    @JsonProperty(value = "id")
	private int id;
    
    @JsonProperty(value = "name")
	private String name;
    
    @JsonProperty(value = "monthlySalry")
	private int monthlySalry;

	public int getMonthlySalry() {
		return monthlySalry;
	}

	public void setMonthlySalry(int monthlySalry) {
		this.monthlySalry = monthlySalry;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
