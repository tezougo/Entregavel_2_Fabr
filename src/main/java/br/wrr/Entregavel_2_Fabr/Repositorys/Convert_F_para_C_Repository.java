package br.wrr.Entregavel_2_Fabr.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.wrr.Entregavel_2_Fabr.Models.Convert_F_para_C_Model;

@Repository
public interface Convert_F_para_C_Repository extends JpaRepository<Convert_F_para_C_Model, Long> {

}
