package com.luisHenrique.angularSpring.domain;

import java.util.Objects;

public class Vidros {

	private Integer id;
	private String nome;
	private Float preco;

	private Modelos modelos;

	public Vidros() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vidros(Integer id, String nome, Float preco, Modelos modelos) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.modelos = modelos;
	}

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

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public Modelos getModelos() {
		return modelos;
	}

	public void setModelos(Modelos modelos) {
		this.modelos = modelos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vidros other = (Vidros) obj;
		return Objects.equals(id, other.id);
	}

}
