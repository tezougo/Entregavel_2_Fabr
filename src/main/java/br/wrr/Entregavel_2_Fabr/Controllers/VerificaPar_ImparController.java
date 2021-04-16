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

import br.wrr.Entregavel_2_Fabr.Models.Par_ImparModel;
import br.wrr.Entregavel_2_Fabr.Repositorys.Par_ImparRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Swagger2RestController", description = "Acessar as funções disponíveis swagger além de realizar o controle dos dados")
@RestController
@RequestMapping("/verifica") // para dizer qual a url, quando o spring deve chamar essa página
public class VerificaPar_ImparController {

	Par_ImparModel par_ImparModel = new Par_ImparModel();

	@Autowired
	private Par_ImparRepository par_ImparRepository;

	@ApiOperation(value = "Resultado da verificação", response = Iterable.class, tags = "getString")
	@GetMapping
	public List<Par_ImparModel> getNumero() {
		return par_ImparRepository.findAll();
	}

	@ApiOperation(value = "Verifica", response = Iterable.class, tags = "PostNumero")
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Par_ImparModel postnumero(@RequestBody Par_ImparModel string) {
		return par_ImparRepository.save(string);
	}

	// @ResponseBody // para não navegar para uma página, se não colocar ele ira
	// procurar uma página

}