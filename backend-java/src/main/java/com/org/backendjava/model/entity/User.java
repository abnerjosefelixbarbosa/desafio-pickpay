package com.org.backendjava.model.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "full_Name")
	private String fullName;
	@Column(name = "docment", unique = true)
	private String docment;
	@Column(name = "email", unique = true)
	private String email;
	@Column(name = "password", unique = true)
	private String password;
	@Column(name = "type_user")
	private TypeUser typeUser;
}