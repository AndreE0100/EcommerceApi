package projetofinal.ecommerce.ecommerceapi.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projetofinal.ecommerce.ecommerceapi.model.negocio.Produto;

@Repository
public interface IProdutoRepository extends CrudRepository<Produto, Integer> {

	List<Produto> findAll(Sort by);
}
