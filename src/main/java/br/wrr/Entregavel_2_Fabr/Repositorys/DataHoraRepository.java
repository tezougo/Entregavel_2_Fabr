package br.wrr.Entregavel_2_Fabr.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.wrr.Entregavel_2_Fabr.Models.DataHoraModel;

@Repository
public interface DataHoraRepository extends JpaRepository<DataHoraModel, Long> {

}
