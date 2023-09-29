package com.td.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Produit extends Audit {

	private String nom;
	@Column(columnDefinition = "double default 0.0")
	private double prix;
}
