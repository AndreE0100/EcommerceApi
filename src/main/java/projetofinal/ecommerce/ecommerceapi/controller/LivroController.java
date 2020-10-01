package projetofinal.ecommerce.ecommerceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import projetofinal.ecommerce.ecommerceapi.model.negocio.Livro;
import projetofinal.ecommerce.ecommerceapi.model.service.LivroService;

@RestController
@RequestMapping("/api/emprestimo")
public class LivroController {

	@Autowired
	private LivroService livroService;

	@ApiOperation(value = "Retornar uma lista de livros")
	@GetMapping(value = "/livros")
	public List<Livro> obterLista() {
		return livroService.obterLista();
	}

	@ApiOperation(value = "Retornar um livro")
	@GetMapping(value = "/livro/{id}")
	public Livro obterPorId(@PathVariable Integer id) {
		return livroService.obterPorId(id);
	}
}