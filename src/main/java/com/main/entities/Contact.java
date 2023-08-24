package com.main.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Entity
@Data
@Table(name="CONTACT")
@NoArgsConstructor
@AllArgsConstructor
public class Contact implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cId;
	private String  name;
	private String secondName;
	private String  work;
	@Column(unique = true)
	private String  email;
	private String  phone;
	private String  image;
	@Column(length = 500)
	private String  dispription;
	
	@ManyToOne
	private User user ;
}
