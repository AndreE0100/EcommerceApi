package projetofinal.ecommerce.ecommerceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import projetofinal.ecommerce.ecommerceapi.model.negocio.Solicitante;
import projetofinal.ecommerce.ecommerceapi.model.service.SolicitanteService;

@RestController
@RequestMapping("/api/emprestimo")
public class SolicitanteController {

	@Autowired private SolicitanteService solicitanteService;
	
	@ApiOperation(value = "Retornar uma lista de solicitantes")
	@GetMapping(value = "/solicitantes")
	public List<Solicitante> obterLista() {
		return solicitanteService.obterLista(); 
	}
	
	@ApiOperation(value = "Retornar uma solicitante")
	@GetMapping(value = "/solicitante/{id}")
	public Solicitante obterPorId(@PathVariable Integer id) {
		return solicitanteService.obterPorId(id);
	}

	@ApiOperation(value = "Cadastrar um novo solicitante")
	@PostMapping(value = "/solicitante/incluir")
	public void incluir(@RequestBody Solicitante solicitante) {
		solicitanteService.incluir(solicitante);
	}
	
	@ApiOperation(value = "Remover um solicitante existente")
	@GetMapping(value = "/solicitante/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		solicitanteService.excluir(id);
	}
}