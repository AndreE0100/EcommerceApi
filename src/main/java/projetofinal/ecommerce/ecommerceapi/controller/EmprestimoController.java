package projetofinal.ecommerce.ecommerceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetofinal.ecommerce.ecommerceapi.model.negocio.Emprestimo;
import projetofinal.ecommerce.ecommerceapi.model.service.EmprestimoService;

@RestController
@RequestMapping("/api/emprestimo")
public class EmprestimoController {

	@Autowired
	private EmprestimoService emprestimoService;

	@GetMapping(value = "/lista")
	public List<Emprestimo> obterLista() {
		return emprestimoService.obterLista();
	}

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Emprestimo emprestimo) {
		emprestimoService.incluir(emprestimo);
	}

	@GetMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		emprestimoService.excluir(id);
	}

	@GetMapping(value = "/{id}/consultar")
	public Emprestimo consultar(@PathVariable Integer id) {
		return emprestimoService.obterPorId(id);
	}
}