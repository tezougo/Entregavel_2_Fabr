package br.wrr.Entregavel_2_Fabr.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.wrr.Entregavel_2_Fabr.Models.DataHoraModel;
import br.wrr.Entregavel_2_Fabr.Repositorys.DataHoraRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Swagger2RestController", description = "Acessar as funções disponíveis swagger além de realizar o controle dos dados")
@RestController
@RequestMapping("/datashoras") // para dizer qual a url, quando o spring deve chamar essa página
public class DataHoraController {

	@Autowired
	private DataHoraRepository repositoryDH;

	@ApiOperation(value = "Retorna as datas", response = Iterable.class, tags = "getHoraatual")
	@GetMapping
	public List<DataHoraModel> getHoraatual() {
		return repositoryDH.findAll();

	}

	@ApiOperation(value = "Cadastra nova data e hora ", response = Iterable.class, tags = "DataHora")
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public DataHoraModel datahora(@RequestBody DataHoraModel horaatual) {
		return repositoryDH.save(horaatual);
	}

	// @ResponseBody // para não navegar para uma página, se não colocar ele ira
	// procurar uma página
}