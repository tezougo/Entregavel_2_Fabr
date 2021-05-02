package br.wrr.Entregavel_2_Fabr.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.wrr.Entregavel_2_Fabr.Models.CadastroIndividuoModel;

@Repository
public interface CadastroIndividuoRepository extends JpaRepository<CadastroIndividuoModel, Long> {
    public CadastroIndividuoModel findByTipo(String tipo);

    public CadastroIndividuoModel findByNome_individuo(String nome_individuo);
}
