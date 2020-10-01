package projetofinal.ecommerce.ecommerceapi.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projetofinal.ecommerce.ecommerceapi.model.negocio.Emprestimo;

@Repository
public interface IEmprestimoRepository extends CrudRepository<Emprestimo, Integer> {

	List<Emprestimo> findAll(Sort by);
}
