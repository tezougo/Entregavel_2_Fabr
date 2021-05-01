package br.wrr.Entregavel_2_Fabr.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import br.wrr.Entregavel_2_Fabr.Models.PopulacaoCidadeModel;

public interface PopulacaoCidadeRepository extends JpaRepository<PopulacaoCidadeModel, Long> {
    public void deleteByAno(int ano);
}
