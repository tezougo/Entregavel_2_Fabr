package br.wrr.Entregavel_2_Fabr.Models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class DataHoraModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	@ApiModelProperty(notes = "Mostra a e hora local", name = "DataHoraAgora", required = true, value = "data e hora")
	@Column(nullable = false)
	private LocalDateTime horaatual = LocalDateTime.now();

	public LocalDateTime getHora_atual() {
		return horaatual;
	}

	public void setHora_atual(LocalDateTime horaatual) {
		this.horaatual = horaatual;
	}

}
