package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity, @Table, @Id and @Column are for JPA

@Data
@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name="id")
	private String id;

	@Column(name = "password")
	private String password;
}