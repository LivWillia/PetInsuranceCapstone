package com.example.oliviawilliamspetinsurancecapstone.model;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name= "pet")

public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name= "pet_id")
    private Long id;
	
	@Column(name= "pet_name")
	private String name;
	
	@Column(name= "pet_age")
	private Integer age;


	@Column(name="breed")
	private String breed;
	
	@ManyToMany
	private List<Medicine> medications;
	
	public Pet() {

	}

	public Pet(Long id, String name, String breed, Integer age) {
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.age = age;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Medicine> getMedications() {
		return medications;
	}


	public void setMedications(List<Medicine> medications) {
		this.medications = medications;
	}

}
