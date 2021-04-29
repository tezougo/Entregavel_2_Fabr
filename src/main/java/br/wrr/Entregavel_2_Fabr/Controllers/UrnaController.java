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
import br.wrr.Entregavel_2_Fabr.Models.UrnaModel;
import br.wrr.Entregavel_2_Fabr.Repositorys.UrnaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Swagger2RestController", description = "Acessar as funções disponíveis swagger além de realizar o controle dos dados")
@RestController
@RequestMapping("/urna") // para dizer qual a url, quando o spring deve chamar essa página
public class UrnaController {
    UrnaModel urna = new UrnaModel();

    @Autowired // instancia a variavel a baixo com a classe repository e todos os metodos
               // disponíveis pela extends do jparepository
    private UrnaRepository urnaRepository;

    @ApiOperation(value = "resultadoUrna", response = Iterable.class, tags = "getVoto")
    @GetMapping // é usa quando utilizado o metodo get através do extends JpaRepository, fazendo
                // vir direto aqui \/
    public List<UrnaModel> getVoto() {
        return urnaRepository.findAll(); // após o autowired é possível usar o metodo findall entre outros
    }

    @ApiOperation(value = "inseriVoto/verificaVoto", response = Iterable.class, tags = "PostVoto")
    @PostMapping // é usado quando utilizado o metodo post através do extends JpaRepository,
                 // fazendo vir direto aqui \/
    @ResponseStatus(HttpStatus.CREATED)
    public UrnaModel postVoto(@RequestBody UrnaModel urna) { // o requestbody é utilizado para converter em um objeto java do tipo UrnaModel
        if (urna.getVoto() == 90) {
            urna.setVerficavoto("Prefeito Pedro");
            return urnaRepository.save(urna);
        } else if (urna.getVoto() == 91) {
            urna.setVerficavoto("Prefeita Dilma");
            return urnaRepository.save(urna);
        } else if (urna.getVoto() == 92) {
            urna.setVerficavoto("Prefeito Wagner");
            return urnaRepository.save(urna);
        } else {
            urna.setVerficavoto("Voto nulo!");
            return urnaRepository.save(urna);
        }
    }

    // @ResponseBody // para não navegar para uma página, se não colocar ele ira
    // procurar uma página

}
