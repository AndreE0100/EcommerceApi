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
import projetofinal.ecommerce.ecommerceapi.model.negocio.Produto;
import projetofinal.ecommerce.ecommerceapi.model.service.ProdutoService;

@RestController
@RequestMapping("/api/emprestimo")
public class ProdutoController {

	@Autowired private ProdutoService produtoService;
	
	@ApiOperation(value = "Cadastrar um novo produto")
	@PostMapping(value = "/produto/incluir")
	public void incluir(@RequestBody Produto produto) {
		produtoService.incluir(produto);
	}

	@ApiOperation(value = "Retornar uma lista de produtos")
	@GetMapping(value = "/produtos")
	public List<Produto> obterLista() {
		return produtoService.obterLista();
	}
	@ApiOperation(value = "Remover um produto existente")
	@GetMapping(value = "/produto/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		produtoService.excluir(id);
	}

	@ApiOperation(value = "Retornar um produto")
	@GetMapping(value = "/produto/{id}")
	public Produto obterPorId(@PathVariable Integer id) {
		return produtoService.obterPorId(id);
	}
}	