package br.wrr.Entregavel_2_Fabr.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import br.wrr.Entregavel_2_Fabr.Models.PopulacaoCidadeModel;
import br.wrr.Entregavel_2_Fabr.Repositorys.PopulacaoCidadeRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Swagger2RestController", description = "Acessar as funções disponíveis swagger além de realizar o controle dos dados")
@RestController
@RequestMapping("/populacaoCidade") // para dizer qual a url, quando o spring deve chamar essa página
public class PopulacaoCidadeController {

    PopulacaoCidadeModel populacaoCidade = new PopulacaoCidadeModel();

    @Autowired // instancia a variavel a baixo com a classe repository e todos os metodos
               // disponíveis pela extends do jparepository
    private PopulacaoCidadeRepository populacaoCidadeRepository;

    @ApiOperation(value = "consultaAnos/Populacoes", response = Iterable.class, tags = "getAllAnos/Populacao")
    @GetMapping // é usa quando utilizado o metodo get através do extends JpaRepository, fazendo
                // vir direto aqui \/
    public List<PopulacaoCidadeModel> getPopulacaos() {
        return populacaoCidadeRepository.findAll(); // após o autowired é possível usar o metodo findall entre outros
    }

    @ApiOperation(value = "consultaAno/Populacao", response = Iterable.class, tags = "getAno/Populacao")
    @GetMapping("/{ano}") // é usa quando utilizado o metodo get através do extends JpaRepository, fazendo
    // vir direto aqui \/
    public PopulacaoCidadeModel getPopulacao(@PathVariable int ano) {
        return populacaoCidadeRepository.findByAno(ano); // após o autowired é possível usar o metodo findall entre
                                                         // outros
    }

    @ApiOperation(value = "inseri_populacao/ano", response = Iterable.class, tags = "PostAno/Populacao")
    @PostMapping("/populacao") // é usado quando utilizado o metodo post através do extends JpaRepository,
    // fazendo vir direto aqui \/
    @ResponseStatus(HttpStatus.CREATED)
    public PopulacaoCidadeModel postPopulacao(@RequestBody PopulacaoCidadeModel populacao) {
        // o requestbody é utilizado para converter em um objeto java do tipo UrnaModel
        return populacaoCidadeRepository.save(populacao);
    }

    // @ResponseBody // para não navegar para uma página, se não colocar ele ira
    // procurar uma página
    @ApiOperation(value = "Exclui a população do ano informado", response = Iterable.class, tags = "DeletarPopulacao")
    @DeleteMapping("/{ano}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAno(@PathVariable int ano) {
        
        populacaoCidadeRepository.delete(populacaoCidadeRepository.getByAno(ano));
    }

    @ApiOperation(value = "Retorna as populacoes atualizadas", response = Iterable.class, tags = "PutPopulacao")
    @PutMapping("/{ano}")
    public PopulacaoCidadeModel putPopulacao(@RequestBody PopulacaoCidadeModel populacaoCidadeModel,
            @PathVariable int ano) {
        // Optional<PessoaModel> p = pessoaRepository.findById(id);
        PopulacaoCidadeModel p = populacaoCidadeRepository.findByAno(ano);
        if (p == null) {
            return null;
        }
        p.setPopulacao(populacaoCidadeModel.getPopulacao());

        return populacaoCidadeRepository.save(p);
    }
}
