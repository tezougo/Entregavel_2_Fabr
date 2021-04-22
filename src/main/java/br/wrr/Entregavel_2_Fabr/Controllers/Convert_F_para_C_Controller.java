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

import br.wrr.Entregavel_2_Fabr.Models.Convert_F_para_C_Model;
import br.wrr.Entregavel_2_Fabr.Repositorys.Convert_F_para_C_Repository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Swagger2RestController", description = "Acessar as funções disponíveis swagger além de realizar o controle dos dados")
@RestController
@RequestMapping("/converti") // para dizer qual a url, quando o spring deve chamar essa página
public class Convert_F_para_C_Controller {
	Convert_F_para_C_Model convert_F_para_C_Model = new Convert_F_para_C_Model();

	@Autowired
	private Convert_F_para_C_Repository repositoryConv;

	@ApiOperation(value = "Convertido", response = Iterable.class, tags = "getTemperatura")
	@GetMapping
	public List<Convert_F_para_C_Model> getTemperatura() {
		return repositoryConv.findAll();
	}

	@ApiOperation(value = "Converte", response = Iterable.class, tags = "PostTemperatura")
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Convert_F_para_C_Model posttemperatura(@RequestBody Convert_F_para_C_Model temperatura) {
		return repositoryConv.save(temperatura);
	}

	// @ResponseBody // para não navegar para uma página, se não colocar ele ira
	// procurar uma página
}
