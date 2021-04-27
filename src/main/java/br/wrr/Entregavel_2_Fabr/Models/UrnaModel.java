package br.wrr.Entregavel_2_Fabr.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class UrnaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	@ApiModelProperty(notes = "Urna", name = "UrnaEletronica", required = true, value = "votação")
	@Column(nullable = false)
	private int numero;
	private String verficavoto;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getVerficavoto() {
		return verficavoto;
	}

	public void setVerficavoto(String verficavoto) {
		this.verficavoto = verficavoto;
	}
}

