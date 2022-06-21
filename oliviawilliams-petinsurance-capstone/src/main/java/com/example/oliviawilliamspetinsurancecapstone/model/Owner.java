package com.example.oliviawilliamspetinsurancecapstone.model;
import java.util.List;

import javax.persistence.*;



@Entity // Entity annotation indicates that the class is a persistent Java class, 
		//used for marking that this POJO is used as an entity in the database.
@Table(name= "owner") //
public class Owner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name="owner_id")
	private Long id;
	
	@Column(name="owner_name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="home_address")
	private String address;
	
	@OneToMany
	private List<Pet> pets;


	public Owner() {
	
	}

	public Owner(Long id, String name, String email, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

}
