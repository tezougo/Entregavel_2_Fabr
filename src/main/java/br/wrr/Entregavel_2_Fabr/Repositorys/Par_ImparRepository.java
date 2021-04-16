package br.wrr.Entregavel_2_Fabr.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.wrr.Entregavel_2_Fabr.Models.Par_ImparModel;

@Repository
public interface Par_ImparRepository extends JpaRepository<Par_ImparModel, Long> {

}
