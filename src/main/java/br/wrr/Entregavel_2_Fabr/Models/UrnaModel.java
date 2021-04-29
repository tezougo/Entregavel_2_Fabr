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

	@ApiModelProperty(notes = "Urna", name = "Exemplo '90'", required = true, value = "Voto para prefeito: 90, 91, 92")
	@Column(nullable = false)
	private int voto;
	private String verficavoto;

	public int getVoto() {
		if (voto == 90) {
			setVerficavoto("Prefeito Pedro");
		} else if (voto == 91) {
			setVerficavoto("Prefeita Dilma");
		} else if (voto == 92) {
			setVerficavoto("Prefeito Wagner");
		} else {
			setVerficavoto("Voto nulo!");
		}
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public String getVerficavoto() {
		return verficavoto;
	}

	public void setVerficavoto(String verficavoto) {
		this.verficavoto = verficavoto;
	}
}
