package projetofinal.ecommerce.ecommerceapi.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import projetofinal.ecommerce.ecommerceapi.model.negocio.Livro;
import projetofinal.ecommerce.ecommerceapi.model.repository.ILivroRepository;

@Service
public class LivroService {

	@Autowired private ILivroRepository livroRepository;
	
	public List<Livro> obterLista(){
		return (List<Livro>)livroRepository.findAll(Sort.by(Sort.Direction.ASC, "descricao"));
	}
	
	public void incluir(Livro livro) {
		livroRepository.save(livro);
	}

	public void excluir(Integer id) {
		livroRepository.deleteById(id);		
	}

	public Livro obterPorId(Integer id) {
		return livroRepository.findById(id).orElse(null);
	}
}