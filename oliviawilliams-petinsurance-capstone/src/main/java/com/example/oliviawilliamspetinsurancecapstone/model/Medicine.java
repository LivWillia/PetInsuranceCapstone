package com.example.oliviawilliamspetinsurancecapstone.model;

import javax.persistence.*;


@Entity
@Table(name= "medicine")
public class Medicine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private Long id;

	
	@Column(name="medicine")
	private String medicine;

	public Medicine() {
		
	}

	public Medicine(Long id, String medicine) {
		this.id = id;
		this.medicine = medicine;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}



}
