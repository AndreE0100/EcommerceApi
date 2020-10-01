package projetofinal.ecommerce.ecommerceapi.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import projetofinal.ecommerce.ecommerceapi.model.negocio.Emprestimo;
import projetofinal.ecommerce.ecommerceapi.model.repository.IEmprestimoRepository;

@Service
public class EmprestimoService {

	@Autowired private IEmprestimoRepository repository;
	
	public void incluir(Emprestimo emprestimo) {
		repository.save(emprestimo);
	}
	
	public List<Emprestimo> obterLista(){
		return (List<Emprestimo>)repository.findAll(Sort.by(Sort.Direction.ASC, "descricao"));
	}

	public Emprestimo obterPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}