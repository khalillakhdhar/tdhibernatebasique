package com.td.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Cours extends Audit {
@Column(unique = true,nullable = false)
@NotBlank
@Size(min = 2,max = 100)
private String nom;
}
