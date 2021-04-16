package br.wrr.Entregavel_2_Fabr.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Convert_F_para_C_Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	@ApiModelProperty(notes = "Converte", name = "Convertido", required = true, value = "conversão")
	@Column(nullable = false)
	private float Temperatura;

	public float getTemperatura() {
		Temperatura = (Temperatura - 32) * 5 / 9;
		return Temperatura;
	}

	public void setTemperatura(float temperatura) {
		Temperatura = temperatura;
	}

}
