package br.wrr.Entregavel_2_Fabr.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.wrr.Entregavel_2_Fabr.Models.PopulacaoCidadeModel;

@Repository
public interface PopulacaoCidadeRepository extends JpaRepository<PopulacaoCidadeModel, Long> {

    public PopulacaoCidadeModel findByAno(int ano);

    public PopulacaoCidadeModel getByAno(int ano);

}
