package br.salesoft.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Consumo")
public class Consumo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
}
