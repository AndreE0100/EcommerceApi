package projetofinal.ecommerce.ecommerceapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import projetofinal.ecommerce.ecommerceapi.model.negocio.Usuario;
import projetofinal.ecommerce.ecommerceapi.model.service.UsuarioService;

@RestController
@RequestMapping("/api/emprestimo")
public class UsuarioController {
	
	@Autowired 
	private UsuarioService usuarioService;

	@ApiOperation(value = "Cadastrar um novo usuário")
	@PostMapping(value = "/usuario/incluir")
	public void incluir(@RequestBody Usuario usuario) {
		usuarioService.incluir(usuario);
	}

	@ApiOperation(value = "Valida a autenticação do usuário")
	@PostMapping(value = "/usuario")
	public boolean isValid(@RequestParam String login, @RequestParam String senha) {		
		return usuarioService.isValid(login, senha);
	}
	
	@ApiOperation(value = "Obter o usuário pelo login")
	@PostMapping(value = "/usuario/{login}")
	public Usuario userExist(@PathVariable String login) {
		return usuarioService.userExist(login);
	}
}