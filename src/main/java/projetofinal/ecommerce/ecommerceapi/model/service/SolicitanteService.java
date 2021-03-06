package projetofinal.ecommerce.ecommerceapi.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import projetofinal.ecommerce.ecommerceapi.model.negocio.Solicitante;
import projetofinal.ecommerce.ecommerceapi.model.repository.ISolicitanteRepository;

@Service
public class SolicitanteService {

	@Autowired private ISolicitanteRepository repository;
	
	public void incluir(Solicitante solicitante) {
		repository.save(solicitante);
	}
	
	public List<Solicitante> obterLista() {
		return (List<Solicitante>)repository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}

	public void excluir(Integer id) {
		repository.deleteById(id);		
	}

	public Solicitante obterPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}
}