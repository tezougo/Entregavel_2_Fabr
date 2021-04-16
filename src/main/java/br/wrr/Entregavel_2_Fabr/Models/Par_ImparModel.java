package br.wrr.Entregavel_2_Fabr.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Par_ImparModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	@ApiModelProperty(notes = "Verifica", name = "Verificado", required = true, value = "verificação")
	@Column(nullable = false)
	private int numero;
	private String verifica;

	public String getNumero() {
		if (numero % 2 == 0) {
			verifica = "PAR";
		} else {
			verifica = "IMPAR";
		}
		return verifica;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
