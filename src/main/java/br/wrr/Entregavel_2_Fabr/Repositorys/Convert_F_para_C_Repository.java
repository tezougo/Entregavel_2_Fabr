package br.wrr.Entregavel_2_Fabr.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.wrr.Entregavel_2_Fabr.Models.Convert_F_para_C_Model;

@Repository // identica como repositorio das requisições
// com o JpaRepository a baixo é possível utilizar algumas requisições http, como: post, get, uptdate e delete
public interface Convert_F_para_C_Repository extends JpaRepository<Convert_F_para_C_Model, Long> {

}
