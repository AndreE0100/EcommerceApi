package projetofinal.ecommerce.ecommerceapi.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetofinal.ecommerce.ecommerceapi.model.negocio.Produto;
import projetofinal.ecommerce.ecommerceapi.model.repository.IProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private IProdutoRepository produtoRepository;
	
	public void incluir(Produto produto) {
		produtoRepository.save(produto);
	}
	
	public void excluir(Integer id) {
		produtoRepository.deleteById(id);
	}
	
	public List<Produto> obterLista(){
		return (List<Produto>)produtoRepository.findAll();
	}
}
