package br.salesoft.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private Integer unidadeMedida;
	private BigDecimal valorcusto;
	private BigDecimal valorvenda;
	private Integer situacao;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(Integer unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	public BigDecimal getValorcusto() {
		return valorcusto;
	}
	public void setValorcusto(BigDecimal valorcusto) {
		this.valorcusto = valorcusto;
	}
	public BigDecimal getValorvenda() {
		return valorvenda;
	}
	public void setValorvenda(BigDecimal valorvenda) {
		this.valorvenda = valorvenda;
	}
	public Integer getSituacao() {
		return situacao;
	}
	public void setSituacao(Integer situacao) {
		this.situacao = situacao;
	}
}
