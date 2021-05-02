package br.wrr.Entregavel_2_Fabr.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class CadastroIndividuoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @ApiModelProperty(notes = "Nome/Tipo", name = "Insira os dados", required = true, value = "Insira Nome_individuo/Tipo")
    @Column(nullable = false)
    private String Nome_individuo;
    private String tipo;

    public String getNome_individuo() {
        return Nome_individuo;
    }

    public void setNome_individuo(String nome_individuo) {
        Nome_individuo = nome_individuo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
