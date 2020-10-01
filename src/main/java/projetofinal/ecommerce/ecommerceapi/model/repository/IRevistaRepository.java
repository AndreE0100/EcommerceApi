package projetofinal.ecommerce.ecommerceapi.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projetofinal.ecommerce.ecommerceapi.model.negocio.Revista;

@Repository
public interface IRevistaRepository extends CrudRepository<Revista, Integer> {

	List<Revista> findAll(Sort by);
}
