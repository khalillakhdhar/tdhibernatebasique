package com.td.entities;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Entity
@Data

public class Etudiant extends Audit {
	@Size(min = 2,max=50)
private String nom;
	@Email
private String email;

}
