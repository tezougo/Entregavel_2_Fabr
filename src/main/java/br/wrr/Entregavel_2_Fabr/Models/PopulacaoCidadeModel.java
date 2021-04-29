package br.wrr.Entregavel_2_Fabr.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class PopulacaoCidadeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    public long getId() {
        return Id;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setId(long id) {
        Id = id;
    }
    public int getPopulacao() {
        return populacao;
    }
    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
    @ApiModelProperty(notes = "Populacao", name = "Insira a populacao.", required = true, value = "Insira a populacao de cada ano")
	@Column(nullable = false)
    private int populacao;
    private int ano;

    
}
