package br.wrr.Entregavel_2_Fabr.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @ApiOperation(value = "consultaPopulacoes", response = Iterable.class, tags = "getVoto")
    @GetMapping // é usa quando utilizado o metodo get através do extends JpaRepository, fazendo
                // vir direto aqui \/
    public List<PopulacaoCidadeModel> getPopulacao() {
        return populacaoCidadeRepository.findAll(); // após o autowired é possível usar o metodo findall entre outros
    }

    @ApiOperation(value = "inseri_populacao/ano", response = Iterable.class, tags = "Postpopulacao")
    @PostMapping // é usado quando utilizado o metodo post através do extends JpaRepository,
                 // fazendo vir direto aqui \/
    @ResponseStatus(HttpStatus.CREATED)
    public PopulacaoCidadeModel postPopulacao(@RequestBody PopulacaoCidadeModel populacao) { 
        // o requestbody é utilizado para converter em um objeto java do tipo UrnaModel
            return populacaoCidadeRepository.save(populacao);
        }
    // @ResponseBody // para não navegar para uma página, se não colocar ele ira
    // procurar uma página

    /// TENHO QUE CONSULTAR SÓ UM ANO ESPECÍFICO E TAMBÉM IMPLEMENTAR O DELETEMAPPING
}
