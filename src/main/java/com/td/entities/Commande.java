package com.td.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
@Entity
@Data
public class Commande extends Audit {
	@Column(columnDefinition = "double default 0.0")
	private double totale;
}
