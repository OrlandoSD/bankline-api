package com.dio.satander.bankline.api.model;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "tab_correntista")
public class Correntista {
	private Integer id;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(length = 20)
	private String cpf;
	
	@Column(length = 60)
	private String nome;
	
	
	private Conta conta;
	
	public Conta getConta() {
		return conta;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
