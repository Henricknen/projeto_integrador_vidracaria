package com.luisHenrique.angularSpring.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Modelos {

	private Integer id;
	private String nome;
	private String descricao;
	
	private List<Vidros> vidros = new ArrayList<>();

	public Modelos() {
		super();
	}

	public Modelos(Integer id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Vidros> getVidros() {
		return vidros;
	}

	public void setVidros(List<Vidros> vidros) {
		this.vidros = vidros;
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
		Modelos other = (Modelos) obj;
		return Objects.equals(id, other.id);
	}
	
	
}

