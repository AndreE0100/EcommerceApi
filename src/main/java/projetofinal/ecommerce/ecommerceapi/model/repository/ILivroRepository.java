package projetofinal.ecommerce.ecommerceapi.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projetofinal.ecommerce.ecommerceapi.model.negocio.Livro;

@Repository
public interface ILivroRepository extends CrudRepository<Livro, Integer> {

	List<Livro> findAll(Sort by);
}
