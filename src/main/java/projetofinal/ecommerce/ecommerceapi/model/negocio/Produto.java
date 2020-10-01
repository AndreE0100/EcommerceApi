package projetofinal.ecommerce.ecommerceapi.model.negocio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "TProduto")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME,
		include = JsonTypeInfo.As.PROPERTY,
		property = "tipoProduto"
		)
@JsonSubTypes({
	@JsonSubTypes.Type(value = Livro.class, name = "L"),
	@JsonSubTypes.Type(value = Revista.class, name = "R")
})
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public abstract class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private Double preco;
	@ManyToMany(mappedBy = "produtos")
	@JsonBackReference
	private List<Emprestimo> emprestimos;
	
	@Override
	public String toString() {
		return String.format("%s", this.getDescricao(), this.getPreco());
	}
	
	public Produto() {
	}
	public Produto(Integer id) {
		this();
		this.setId(id);
	}
	public Produto(Integer id, String descricao, Double preco) {
		this(id);
		this.setDescricao(descricao);
		this.setPreco(preco);
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco=preco;
	}
	
	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}
	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}
}